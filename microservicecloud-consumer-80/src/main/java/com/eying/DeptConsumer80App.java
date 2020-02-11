package com.eying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 20:26
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT")
public class DeptConsumer80App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80App.class,args);
    }
}
