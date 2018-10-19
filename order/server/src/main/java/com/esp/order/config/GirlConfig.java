package com.esp.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author hekai
 * @Date 2018/10/19 10:23
 */
@Component
@ConfigurationProperties("girl")
@RefreshScope
@Data
public class GirlConfig {

    private String name;

    private Integer age;
}
