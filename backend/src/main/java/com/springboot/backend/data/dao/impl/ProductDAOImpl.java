package com.springboot.backend.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.data.dao.ProductDAO;
import com.springboot.backend.data.entity.ProductEntity;
import com.springboot.backend.data.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	
    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }
	
    @Override
    public ProductEntity getProduct(String productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
