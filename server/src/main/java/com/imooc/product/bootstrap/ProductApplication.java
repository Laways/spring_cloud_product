package com.imooc.product.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.imooc")
@MapperScan("com.imooc.product.dao")
@EnableDiscoveryClient
@EnableFeignClients("com.imooc.product.client.order")
public class ProductApplication {
    public static void main(String [] args){
        SpringApplication.run(ProductApplication.class, args);
    }
}
