package com.imooc.product.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/message")
public class Product2OrderMessageController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/test")

    public String testMessage(){
        amqpTemplate.convertAndSend("productMessage","data:" + new Date());
        return "success";
    }
}
