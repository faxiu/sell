package com.esp.product.service.impl;

import com.esp.product.dataobject.ProductCategory;
import com.esp.product.repository.ProductCategoryRepository;
import com.esp.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description TODO
 * @Author hekai
 * @Date 2018/10/8 16:36
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryType) {
        return productCategoryRepository.findByCategoryTypeIn(productCategoryType);
    }
}
