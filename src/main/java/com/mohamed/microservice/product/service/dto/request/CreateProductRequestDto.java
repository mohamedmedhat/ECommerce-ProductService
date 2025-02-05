package com.mohamed.microservice.product.service.dto.request;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public class CreateProductRequestDto {
    @NotBlank
    private String id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private BigDecimal price;

    public CreateProductRequestDto(String id, String name, String description, BigDecimal price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
