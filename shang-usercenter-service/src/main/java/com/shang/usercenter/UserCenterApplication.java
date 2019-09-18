package com.shang.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient  //开启eureka 客户端,注册服务信息
@EnableFeignClients(basePackages = {"com.shang.api"} ) //开启feign 客户端
public class UserCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class,args);
    }

    @Bean
    @LoadBalanced  //使用负载均衡器Ribbon 加上这个注解,RestTemplate去发请求的时候,都会被ribbon 拦截
    //ribbon连接eureka server
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
