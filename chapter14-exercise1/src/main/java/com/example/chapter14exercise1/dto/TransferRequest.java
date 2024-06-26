package com.example.chapter14exercise1.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransferRequest {
    private int senderAccountId;
    private int receiverAccountId;
    private BigDecimal amount;
}
