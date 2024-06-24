package com.example.chapter10exercise5.service;

import com.example.chapter10exercise5.exceptions.NotEnoughMoneyException;
import com.example.chapter10exercise5.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
