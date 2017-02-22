package test.ssm.data.service;

import org.apache.commons.beanutils.BeanUtils;
import test.ssm.api.model.PageBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunjianchun on 17/2/21.
 */
public class BaseData<T1, T2> {
    public List<T2> convertDomain(List<T1> list, Class<T2> clazz) {
        List<T2> newlist = new ArrayList<T2>();
        for (T1 t1: list) {
            try {
                T2 t2 = clazz.newInstance();
                BeanUtils.copyProperties(t2, t1);
                newlist.add(t2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return newlist;
    }
}
