package com.yjf.test;


import com.yjf.controller.UserController;
import com.yjf.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 余俊锋
 * @date 2020/9/29 11:25
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {

    @Autowired
    UserController userController;

    @Test
    public void  demo(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        User user = new User(null,"张三",18,2000d);
        userController.save(user);

    }
}
