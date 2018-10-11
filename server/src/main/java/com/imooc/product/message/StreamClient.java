package com.imooc.product.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {

    String PRODUCTMESSAGE = "productMessage";

    String ORDERMESSAGE = "orderMessage";

    @Input(StreamClient.ORDERMESSAGE)
    SubscribableChannel orderInput();

    @Output(StreamClient.PRODUCTMESSAGE)
    MessageChannel productOutput();


}
