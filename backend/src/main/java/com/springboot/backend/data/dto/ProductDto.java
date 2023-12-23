package com.springboot.backend.data.dto;

import com.springboot.backend.data.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

	private String productId;
	private String productName;
	private int productPrice;
	private int productStock;
	
	public ProductEntity toEntity() {
		return ProductEntity.builder()
				.productId(productId)
				.productName(productName)
				.productPrice(productPrice)
				.productStock(productStock)
				.build();
	}
	
}