package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableAutoConfiguration
@EnableZuulProxy   /* 包含了 @EnableZuulServer ，设置该类是⽹关的启动类。*/
public class ZuulApplication {

    public static void main(String[] args) {
            SpringApplication.run(ZuulApplication.class,args);
        }
}
