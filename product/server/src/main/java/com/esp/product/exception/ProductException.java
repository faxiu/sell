package com.esp.product.exception;

import com.esp.product.enums.ResultEnum;

/**
 * @Author hekai
 * @Date 2018/10/15 14:21
 */
public class ProductException extends RuntimeException {
    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
