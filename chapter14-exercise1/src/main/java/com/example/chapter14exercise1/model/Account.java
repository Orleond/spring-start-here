package com.example.chapter14exercise1.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Getter
@Setter
public class Account {
    @Id
    private int id;
    private String name;
    private BigDecimal amount;
}
