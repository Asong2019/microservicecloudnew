package com.eying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 20:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.eying"})
@ComponentScan("com.eying")
public class DeptConsumer80_feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign_App.class,args);
    }
}
