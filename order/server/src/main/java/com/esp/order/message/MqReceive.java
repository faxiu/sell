package com.esp.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author hekai
 * @Date 2018/10/19 14:39
 */
@Slf4j
@Component
public class MqReceive {

    //1.@RabbitListener(queues = "myQueue")
    //2.自动创建队列名
    //@RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //3.自动创建队列，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message) {
        log.info("MqReceive = {}", message);
    }

    /**
     * 数码服务接收
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            key = "computer",
            exchange = @Exchange("orderExchange")
    ))
    public void processComputer(String message) {
        log.info("computer MqReceive = {}", message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),
            key = "fruit",
            exchange = @Exchange("orderExchange")
    ))
    public void processFruit(String message) {
        log.info("fruit MqReceive = {}", message);
    }
}
