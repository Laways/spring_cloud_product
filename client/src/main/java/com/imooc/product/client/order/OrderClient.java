package com.imooc.product.client.order;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="order", fallback = OrderClient.OrderClientFallback.class)
public interface OrderClient {

    @RequestMapping("/order/findAllOrders")
    String findAllOrders();

    @Component
    static class OrderClientFallback implements OrderClient{

        @Override
        public String findAllOrders() {
            return "网络忙，请稍后再试";
        }
    }

}
