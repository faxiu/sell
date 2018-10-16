package com.esp.order.repository;

import com.esp.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author hekai
 * @Date 2018/10/9 14:22
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
