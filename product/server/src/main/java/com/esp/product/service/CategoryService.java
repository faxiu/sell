package com.esp.product.service;

import com.esp.product.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryType);
}
