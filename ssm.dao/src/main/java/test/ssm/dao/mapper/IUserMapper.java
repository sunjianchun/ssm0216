package test.ssm.dao.mapper;

import com.sun.javafx.font.t2k.T2KFactory;
import test.ssm.dao.domain.UserDomain;

/**
 * Created by sunjianchun on 17/2/16.
 */
public interface IUserMapper extends IBaseMapper{
    public UserDomain getById(Integer integer) throws Exception;
}
