package com.esp.order.repository;

import com.esp.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("21442");
        orderDetail.setOrderId("1234567");
        orderDetail.setProductId("120");
        orderDetail.setProductName("果冻");
        orderDetail.setProductPrice(new BigDecimal(1.0));
        orderDetail.setProductQuantity(100);
        orderDetail.setProductIcon("www.baidu.com");
        OrderDetail result = orderDetailRepository.save(orderDetail);

        Assert.assertTrue(result != null);
    }
}