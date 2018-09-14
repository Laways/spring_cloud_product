package com.imooc.product.service.impl;

import com.imooc.product.dao.ProductInfoMapper;
import com.imooc.product.entity.ProductInfo;
import com.imooc.product.entity.ProductInfoExample;
import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> queryAllProduct() {
        ProductInfoExample example = new ProductInfoExample();
        example.createCriteria();
        return productInfoMapper.selectByExample(example);
    }
}
