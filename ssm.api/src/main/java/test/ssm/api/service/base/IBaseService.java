package test.ssm.api.service.base;

import test.ssm.api.model.PageBean;

/**
 * Created by sunjianchun on 17/2/21.
 */
public interface IBaseService<T1,T2> {
    public PageBean<T2> getList(Integer pageNum, Integer length);
}
