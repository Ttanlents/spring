package com.yjf.dao;

import com.yjf.utils.DbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * @author 余俊锋
 * @date 2020/9/29 12:05
 * @Description
 */

public class BaseDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;


}
