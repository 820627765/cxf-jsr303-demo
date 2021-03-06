package com.example.config;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/service/*");
    }
}
