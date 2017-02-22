package test.ssm.api.service;

import test.ssm.api.model.User;
import test.ssm.api.service.base.IBaseService;

/**
 * Created by sunjianchun on 17/2/16.
 */
public interface IUserService extends IBaseService{
    public User getById(Integer integer) throws Exception;
}
