package com.esp.product.enums;

import lombok.Getter;

/**
 * @Author hekai
 * @Date 2018/10/15 14:26
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIT(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
