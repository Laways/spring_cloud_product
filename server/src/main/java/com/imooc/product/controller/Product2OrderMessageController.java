package com.imooc.product.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.common.ResultUtils;
import com.imooc.common.utils.Result;
import com.imooc.product.client.vo.ProductVo;
import com.imooc.product.entity.ProductInfo;
import com.imooc.product.message.StreamClient;
import com.imooc.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/message")
public class Product2OrderMessageController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private ProductService productService;

    @Autowired
    private StreamClient streamClient;

    private final Logger log = LoggerFactory.getLogger(Product2OrderMessageController.class);

    @GetMapping("/test")
    public Object testMessage(HttpServletRequest request){
        String data = new Date()+"";
        Cookie[] cookies = request.getCookies();
        amqpTemplate.convertAndSend("dateMessage","data:" + data);
        Result result = ResultUtils.getSuccess();
        result.setData(data);
        return result.getResult();
    }

    @GetMapping("/testProductMsg")
    public Object testProductMsg(){
        Result result = ResultUtils.getSuccess();
        List<ProductInfo> productInfos = productService.queryAllProduct();
        List<ProductVo> productVos = new ArrayList<>();
        for (ProductInfo productInfo : productInfos) {
            ProductVo productVo = new ProductVo();
            BeanUtils.copyProperties(productInfo,productVo);
            productVos.add(productVo);
        }
        amqpTemplate.convertAndSend("productMessage",JSON.toJSONString(productInfos));
        log.info("json_str: " + JSON.toJSONString(productInfos));
        result.setData(productInfos);
        return result.getResult();
    }

    @GetMapping("/testSpringCloudStream")
    public Object testSpringCloudStream(){
        Result result = ResultUtils.getSuccess();
        String message = "now " + new Date();
        streamClient.productOutput().send(MessageBuilder.withPayload(message).build());
        log.info("send success .");
        result.setData(message);
        return result.getResult();
    }

}
