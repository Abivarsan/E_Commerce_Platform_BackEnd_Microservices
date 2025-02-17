package com.ecommerce.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    @Id
    private String skucode;
    private String name;
    private String description;
    private BigDecimal price;
    private String category;
    // product image
    private String imageURl;
    // Product type to differentiate products units vs weight
    private ProductType type;

    public enum ProductType {
        unit,
        weight
    }
}