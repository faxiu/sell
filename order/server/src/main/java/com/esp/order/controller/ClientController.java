package com.esp.order.controller;

import com.esp.product.client.ProductClient;
import com.esp.product.common.DecreaseStockInput;
import com.esp.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 测试
 * @Author hekai
 * @Date 2018/10/12 16:02
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

//    @GetMapping("getMsg")
//    public String getMsg(){

        //1.
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8081/msg", String.class);
        //2.
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/msg";
//        String response = restTemplate.getForObject(url, String.class);

        //3.
//        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);

//        String response = productClient.productMsg();
//        log.info("【信息】response={}", response);
//        return response;
//    }

    @GetMapping("/getProductList")
    public List<ProductInfoOutput> listForList(){
        List<ProductInfoOutput> productInfoList = productClient.listForOrder(Arrays.asList("157875196366160022", "157875227953464068"));
        log.info("【查询商品信息列表】 productInfoList= {}", productInfoList);
        return productInfoList;
    }

    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("164103465734242707", 2);
        productClient.decreaseStock(Arrays.asList(decreaseStockInput));
        log.info("【扣库存】 成功！");
        return "ok";
    }
}
