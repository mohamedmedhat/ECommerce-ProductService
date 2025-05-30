package com.mohamed.microservice.product.service.mapper;

import com.mohamed.microservice.product.service.dto.request.CreateProductRequestDto;
import com.mohamed.microservice.product.service.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product productToEntity(CreateProductRequestDto productData){
        Product product = new Product();
        product.setId(productData.getId());
        product.setName(productData.getName());
        product.setDescription(productData.getDescription());
        product.setPrice(productData.getPrice());
        return product;
    }
}
