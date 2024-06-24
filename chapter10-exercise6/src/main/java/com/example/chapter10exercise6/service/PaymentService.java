package com.example.chapter10exercise6.service;

import com.example.chapter10exercise6.exceptions.NotEnoughMoneyException;
import com.example.chapter10exercise6.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
