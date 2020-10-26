package com.yjf.dao;

import com.yjf.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 余俊锋
 * @date 2020/9/29 12:02
 * @Description
 */
@Repository
public class UserDao extends BaseDao{
    public void addUser(User user){
        String sql="insert into user(id,name,age,salary) values(default,?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getAge(),user.getSalary());
    }
}
