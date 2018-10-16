package com.esp.order.repository;

import com.esp.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author hekai
 * @Date 2018/10/9 14:21
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
