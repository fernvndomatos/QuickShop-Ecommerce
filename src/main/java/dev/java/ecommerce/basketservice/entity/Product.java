package dev.java.ecommerce.basketservice.entity;

import lombok.*;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Product {

    private Long productId;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
