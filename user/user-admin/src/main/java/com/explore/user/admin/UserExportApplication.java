package com.explore.user.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.explore.user.admin.mapper")
public class UserExportApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserExportApplication.class, args);
    }

}
