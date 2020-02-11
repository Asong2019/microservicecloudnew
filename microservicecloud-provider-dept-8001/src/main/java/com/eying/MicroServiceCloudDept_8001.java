package com.eying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 18:19
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudDept_8001 {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudDept_8001.class,args);
    }
}
