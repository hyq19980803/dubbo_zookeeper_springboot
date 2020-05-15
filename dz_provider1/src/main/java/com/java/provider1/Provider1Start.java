package com.java.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:djin
 * date:2020-05-08-10:58
 *   提供者1的启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.provider1.*")
public class Provider1Start {

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(Provider1Start.class);
    }
}
