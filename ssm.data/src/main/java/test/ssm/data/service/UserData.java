package test.ssm.data.service;

import com.github.pagehelper.PageHelper;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.ssm.api.model.PageBean;
import test.ssm.api.model.User;
import test.ssm.api.service.IUserService;
import test.ssm.dao.domain.UserDomain;
import test.ssm.dao.mapper.IBaseMapper;
import test.ssm.dao.mapper.IUserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sunjianchun on 17/2/16.
 */
@Service("iuserServiceImpl")
public class UserData extends BaseData{
    @Autowired
    private IUserMapper iUserMapper;

    public User getById(Integer id) throws Exception {
        User user = new User();
        UserDomain userDomain = iUserMapper.getById(id);
        System.out.println(id);
        BeanUtils.copyProperties(user, userDomain);
        System.out.println(user.toString1());
        return user;
    }

    public PageBean<User> getList(Integer pageNum, Integer length) {
        PageHelper.startPage(pageNum, length);
        List<UserDomain> userDomainList =  iUserMapper.getList(pageNum, length);
        PageBean<UserDomain> userDomainPageBean = new PageBean<UserDomain>(userDomainList);
        List<User> userList = convertDomain(userDomainList, User.class);
        return new PageBean<User>(userDomainPageBean, userList);
    }
}
