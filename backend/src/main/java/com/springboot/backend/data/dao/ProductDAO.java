package com.springboot.backend.data.dao;

import com.springboot.backend.data.entity.ProductEntity;

public interface ProductDAO {

	ProductEntity saveProduct(ProductEntity productEntity);
	
	ProductEntity getProduct(String productId);

}
