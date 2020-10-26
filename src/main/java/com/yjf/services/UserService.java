package com.yjf.services;

import com.yjf.dao.UserDao;
import com.yjf.entity.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 余俊锋
 * @date 2020/9/29 11:31
 * @Description
 */
@Service
public class UserService {
   @Autowired
    UserDao userDao;


    final  static Logger logger= LoggerFactory.getLogger(UserService.class);
    //private final Logger log= Logger.getLogger(UserService.class);
    public void addUser(User user){
        userDao.addUser(user);
       logger.info("数据插入成功！");
    }
}
