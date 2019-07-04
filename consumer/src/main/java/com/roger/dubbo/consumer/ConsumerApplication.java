package com.roger.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.roger.dubbo.api.InvokerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication (scanBasePackages = "com.roger.dubbo")
//@EnableDubbo
public class ConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);

        InvokerClient apiInvoker = (InvokerClient) run.getBean("invokerClient");

        int a = 1;
        int b = 2;
        apiInvoker.testAdd(a, b);
    }

}
