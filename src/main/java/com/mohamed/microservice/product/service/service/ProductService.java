package com.mohamed.microservice.product.service.service;

import com.mohamed.microservice.product.service.dto.request.CreateProductRequestDto;
import com.mohamed.microservice.product.service.mapper.ProductMapper;
import com.mohamed.microservice.product.service.model.Product;
import com.mohamed.microservice.product.service.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public Product createProduct(CreateProductRequestDto productData){
        Product product = this.productMapper.productToEntity(productData);
        return this.productRepository.save(product);
    }
}
