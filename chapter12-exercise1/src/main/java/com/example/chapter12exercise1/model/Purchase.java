package com.example.chapter12exercise1.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Purchase {
    private int id;
    private String product;
    private BigDecimal price;
}
