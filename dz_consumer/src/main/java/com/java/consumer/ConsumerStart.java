package com.java.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:djin
 * date:2020-05-08-11:53
 *   消费者启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.consumer.*")
public class ConsumerStart {

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class);
    }
}
