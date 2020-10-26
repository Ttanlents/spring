package com.yjf.controller;


import com.yjf.entity.User;
import com.yjf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 余俊锋
 * @date 2020/9/29 12:15
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;


    public void save(User user) {
        userService.addUser(user);

    }


}
