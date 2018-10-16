package com.esp.product.service;

import com.esp.product.common.DecreaseStockInput;
import com.esp.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有在架商品列表
     */

    List<ProductInfo> findUpAll();

    /**
     * 根据商品Id查询商品列表
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
