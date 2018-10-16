package com.esp.order.expection;

import com.esp.order.enums.ResultEnum;

/**
 * @Author hekai
 * @Date 2018/10/12 15:01
 */
public class OrderExpection extends RuntimeException {

    private Integer code;

    public OrderExpection(Integer code, String message){
        super(message);
        this.code = code;
    }

    public OrderExpection(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
