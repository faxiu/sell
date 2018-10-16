package com.esp.order.controller;

import com.esp.order.VO.ResultVO;
import com.esp.order.converter.OrderForm2OrderDTOConverter;
import com.esp.order.dto.OrderDTO;
import com.esp.order.enums.ResultEnum;
import com.esp.order.expection.OrderExpection;
import com.esp.order.form.OrderForm;
import com.esp.order.service.OrderService;
import com.esp.order.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author hekai
 * @Date 2018/10/9 14:23
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        //1.参数校验
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】 参数不正确，orderForm={}", orderForm);
            throw new OrderExpection(ResultEnum.PARAM_ERROR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        //orderForm -> orderDTO
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.converter(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】 购物车为空");
            throw new OrderExpection(ResultEnum.CART_EMPTY);
        }

        OrderDTO result = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", result.getOrderId());
        return ResultVOUtil.success(map);
    }
}
