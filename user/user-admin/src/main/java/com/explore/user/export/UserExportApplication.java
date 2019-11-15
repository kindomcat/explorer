package com.explore.user.export;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserExportApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserExportApplication.class, args);
    }

}
