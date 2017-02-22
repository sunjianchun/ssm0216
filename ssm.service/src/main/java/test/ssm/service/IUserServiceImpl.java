package test.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.ssm.api.model.PageBean;
import test.ssm.api.model.User;
import test.ssm.api.service.IUserService;
import test.ssm.data.service.UserData;

/**
 * Created by sunjianchun on 17/2/16.
 */
@Service("iUserServiceImpl")
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserData userData;

    public PageBean getList(Integer pageNum, Integer length) {
        PageBean<User> pageBean = userData.getList(pageNum, length);
        System.out.println(pageBean.getData().get(0).toString1());
        return pageBean;
    }

    public User getById(Integer id) throws Exception {
        try {
           User user = userData.getById(id);
            System.out.println(user.toString1());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
