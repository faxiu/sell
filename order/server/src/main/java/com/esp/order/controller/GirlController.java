package com.esp.order.controller;

import com.esp.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hekai
 * @Date 2018/10/19 10:25
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/print")
    public String print(){
        return "name = " + girlConfig.getName() + ", age = " + girlConfig.getAge();
    }
}
