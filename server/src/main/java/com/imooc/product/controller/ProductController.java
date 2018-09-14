package com.imooc.product.controller;

import com.imooc.product.client.order.OrderClient;
import com.imooc.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class ProductController {

    private Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderClient orderClient;

    @GetMapping("/queryAllProduct")
    public Object queryAllProduct(){
        log.info("queryAllProduct execute");
        return productService.queryAllProduct();
    }

    @GetMapping("/getOrders3")
    public Object getOrders3(){
        String resultStr = restTemplate.getForObject("http://order/order/findAllOrders", String.class);

        return resultStr;
    }
    @GetMapping("/getOrders2")
    public Object getOrders2(){
        RestTemplate template = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort());
        String resultStr = restTemplate.getForObject(url,String.class);
        return resultStr;
    }
    @GetMapping("/getOrders1")
    public Object getOrders1(){
        RestTemplate template = new RestTemplate();
        String resultStr = template.getForObject("http://192.168.203.128:8091/order/findAllOrders", String.class);
        return resultStr;
    }

    @GetMapping("/getOrdersFeign")
    public Object getOrdersFeign(){
        return orderClient.findAllOrders();
    }
}
