package com.esp.order.service;

import com.esp.order.dto.OrderDTO;

/**
 * @Author hekai
 * @Date 2018/10/10 14:47
 */
public interface OrderService {
    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
