package com.esp.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hekai
 * @Date 2018/10/12 16:03
 */
@RestController
public class ServerController {

    @GetMapping("msg")
    public String msg() {
        return "Hello World!";
    }
}
