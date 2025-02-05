package com.mohamed.microservice.product.service.controller;

import com.mohamed.microservice.product.service.dto.request.CreateProductRequestDto;
import com.mohamed.microservice.product.service.model.Product;
import com.mohamed.microservice.product.service.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Product CreateProduct(@RequestBody CreateProductRequestDto productData){
        return this.productService.createProduct(productData);
    }
}
