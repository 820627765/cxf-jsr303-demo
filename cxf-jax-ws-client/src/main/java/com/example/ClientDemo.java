package com.example;

import com.example.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ClientDemo {
    public static void main(String[] args) {
        // 创建一个客户端的工厂对象（可以看出是个代理工厂）
        JaxWsProxyFactoryBean proxyFactoryBean = new JaxWsProxyFactoryBean();

        // 设置参数
        proxyFactoryBean.setAddress("http://localhost:8888/userService");
        // 设置要访问的是那个webservice接口的逻辑
        proxyFactoryBean.setServiceClass(UserService.class);

        //3，创建指定接口的代理对象
        UserService userService = (UserService) proxyFactoryBean.create();

        //4，通过代理对象访问服务端对应的接口
        userService.saveUser(new User1(1,"xiaozhang",22));
    }
}
