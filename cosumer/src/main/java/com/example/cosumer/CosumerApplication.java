package com.example.cosumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class CosumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CosumerApplication.class, args);
    }

}

