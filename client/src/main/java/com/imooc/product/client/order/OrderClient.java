package com.imooc.product.client.order;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("order")
public interface OrderClient {

    @RequestMapping("/order/findAllOrders")
    String findAllOrders();

}
