package com.example;

import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class PublishServerService {
    public static void main(String[] args) {
        //1,创建工厂对象
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

        //2,设置参数
        //设置服务端的访问地址
        factoryBean.setAddress("http://localhost:8888/userService");
        //设置要发布的webservice接口
        factoryBean.setServiceClass(UserService.class);
        //设置要发布的webservice接口的实现类，当客户端调用时，才知道去调用那个实现的逻辑
        factoryBean.setServiceBean(new UserServiceImpl());

        // 设置拦截器
        // 设置输入拦截器
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        // 设置输出拦截器
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        //3,发布接口（阻塞方法）
        factoryBean.create();

        System.out.println("webservice服务程序发布成功");
    }
}
