package com.yupoop.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@ComponentScan("com.yupoop")
@MapperScan("com.yupoop.user.mapper")
@EnableDiscoveryClient
@EnableFeignClients("com.yupoop")
public class UserMainStarterApp {

    public static void main(String[] args) {
        try {
            SpringApplication.run(UserMainStarterApp.class,args);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
