package com.czq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //包含了EnableZuulServer，设置该类是网关的启动类
@EnableAutoConfiguration //可以帮助springboot应用将所有符合条件的configuration配置加载到当前springboot创建并使用的IoC容器中
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
