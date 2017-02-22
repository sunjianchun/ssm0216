package test.ssm.dao.mapper;

import java.util.List;

/**
 * Created by sunjianchun on 17/2/21.
 */
public interface IBaseMapper<T1, T2> {
    public List<T2> getList(Integer pageNum, Integer length);
}
