package com.yjf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 余俊锋
 * @date 2020/9/29 14:39
 * @Description
 */
@Configuration
@ComponentScan("com.yjf")
@PropertySource("classpath:db.properties")
public class Application {
}
