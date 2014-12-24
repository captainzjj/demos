package cn.springmvc.tes;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snappy.po.User;
import com.snappy.services.UserService;
 
public class UserTests{
 
    private UserService userService;
     
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
      
    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("lyx");
        user.setPassword("123456");
//        user.setMoney(10);
        System.out.println(userService.register(user));
    }
}