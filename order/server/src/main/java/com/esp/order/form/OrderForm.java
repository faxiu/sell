package com.esp.order.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Author hekai
 * @Date 2018/10/12 14:55
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotEmpty(message = "电话不能为空")
    private String phone;

    @NotEmpty(message = "地址不能为空")
    private String address;

    @NotEmpty(message = "openid不能为空")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;


}
