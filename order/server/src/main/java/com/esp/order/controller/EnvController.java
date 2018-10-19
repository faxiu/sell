package com.esp.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hekai
 * @Date 2018/10/18 15:18
 */
@RestController
public class EnvController {

    @Value("${env}")
    private String env;

    @GetMapping("/env")
    public String print() {
        return env;
    }
}
