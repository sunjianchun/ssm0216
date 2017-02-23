package test.ssm.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.ssm.api.model.User;
import test.ssm.api.service.IUserService;

import java.util.List;

/**
 * Created by sunjianchun on 17/2/23.
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"classpath*:dubbo-consumer.xml"});

        IUserService iUserService = (IUserService) applicationContext.getBean("iUserServiceImpl");
        try {
            System.out.println(iUserService.getById(1).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<User> list = iUserService.getList(1,6).getData();
        for (User user: list) {
            System.out.println(user.toString());
        }
    }

}
