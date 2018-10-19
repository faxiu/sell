package com.esp.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Date;

/**
 * @Author hekai
 * @Date 2018/10/19 14:43
 */
public class MqSendTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue", "now = " + new Date());
    }

    @Test
    public void sendFruit(){
        amqpTemplate.convertAndSend("orderExchange", "fruit", "now = " + new Date());
    }
}
