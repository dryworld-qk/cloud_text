package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients     /*启动feign客户端*/
@EnableCircuitBreaker   /* 声明启用数据监控 */
@EnableHystrixDashboard     /* 声明启用可视化的数据监控 */
public class HystrixApplication {

    public static void main(String[] args) {
            SpringApplication.run(HystrixApplication.class,args);
        }
}
