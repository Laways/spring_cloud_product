package com.imooc.product.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
public class MessageReceive {

    private final Logger log = LoggerFactory.getLogger(MessageReceive.class);

    @StreamListener(value = StreamClient.ORDERMESSAGE)
    public void orderReturnMsg(String msg){
        log.info("Order_Server_return_msg: " + msg);
    }
}
