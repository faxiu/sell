package com.esp.order.message;

import com.esp.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @Author hekai
 * @Date 2018/10/19 16:05
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceive {

//    @StreamListener(StreamClient.INPUT)
//    public void process(String message){
//        log.info("StreamReceive = {}", message);
//    }

    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.OUTPUT2)
    public String process(OrderDTO message){
        log.info("StreamReceive = {}", message);
        return "OK!";
    }

    @StreamListener(StreamClient.INPUT2)
    public void process2(String message){
        log.info("StreamReceive2 = {}", message);
    }

}
