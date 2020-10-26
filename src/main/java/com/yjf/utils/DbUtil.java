package com.yjf.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author admin
 * @date 2020/9/22
 * @Description jdbcTemplate连接工具类
 */


public class DbUtil {
    @Value("${name}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;
    @Value("${driverName}")
    private String driverName;
    /**
     * 获取数据源
     */
    public  DruidDataSource getDataSource() {
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setUrl(this.url);
        druidDataSource.setUsername(this.username);
        druidDataSource.setPassword(this.password);
        druidDataSource.setDriverClassName(this.driverName);
        return druidDataSource;
    }

}
