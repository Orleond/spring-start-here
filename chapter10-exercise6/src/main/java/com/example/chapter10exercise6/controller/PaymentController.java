package com.example.chapter10exercise6.controller;

import com.example.chapter10exercise6.exceptions.NotEnoughMoneyException;
import com.example.chapter10exercise6.model.ErrorDetail;
import com.example.chapter10exercise6.model.PaymentDetails;
import com.example.chapter10exercise6.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment() {
        var paymentDetails = paymentService.processPayment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
