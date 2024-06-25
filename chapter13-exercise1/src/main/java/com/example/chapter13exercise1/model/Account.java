package com.example.chapter13exercise1.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Account {
    private int id;
    private String name;
    private BigDecimal amount;
}
