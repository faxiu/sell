package com.esp.order.converter;

import com.esp.order.dataobject.OrderDetail;
import com.esp.order.dto.OrderDTO;
import com.esp.order.enums.ResultEnum;
import com.esp.order.expection.OrderExpection;
import com.esp.order.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author hekai
 * @Date 2018/10/12 15:06
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO converter(OrderForm orderForm){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        Gson gson = new Gson();

        List<OrderDetail> orderDetailList;

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){
            }.getType());
        }catch (Exception e){
            log.error("【json转换错误】 String = {}", orderForm.getItems());
            throw new OrderExpection(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
