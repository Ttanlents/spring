package com.yjf.services.impl;

import com.yjf.services.Service;
import com.yjf.services.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 余俊锋
 * @date 2020/9/30 10:38
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
       /* Service service = (Service)Proxy.newProxyInstance(ServiceImpl.class.getClassLoader(), ServiceImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(proxy.getClass());
                System.out.println(method.getName());
                System.out.println("增强方法");
                Object o = method.invoke(new ServiceImpl());
                return o;
            }
        });
        service.save();*/
        /*Object o = Enhancer.create(UserService.class, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                Object invoke = method.invoke(new UserService(), objects[0]);
                System.out.println("增强的代码");
                return invoke;
            }
        });*/

    }
}
