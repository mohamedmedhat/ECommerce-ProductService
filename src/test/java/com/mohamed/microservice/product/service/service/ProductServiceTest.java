package com.mohamed.microservice.product.service.service;

import com.mohamed.microservice.product.service.dto.request.CreateProductRequestDto;
import com.mohamed.microservice.product.service.mapper.ProductMapper; // Assuming this import exists
import com.mohamed.microservice.product.service.model.Product;
import com.mohamed.microservice.product.service.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Mock
    private ProductMapper productMapper;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProduct() {
        CreateProductRequestDto productDto = new CreateProductRequestDto("1", "Product Name", "Description", BigDecimal.valueOf(20.0));

        Product product = new Product();
        product.setId("1");
        product.setName("Product Name");
        product.setDescription("Description");
        product.setPrice(BigDecimal.valueOf(20.0));

        when(productMapper.productToEntity(productDto)).thenReturn(product);

        Product result = productService.createProduct(productDto);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(result, product);
    }
}
