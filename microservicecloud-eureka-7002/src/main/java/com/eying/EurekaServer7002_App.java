package com.eying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 18:51
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
