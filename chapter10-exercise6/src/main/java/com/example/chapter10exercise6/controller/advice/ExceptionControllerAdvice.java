package com.example.chapter10exercise6.controller.advice;

import com.example.chapter10exercise6.exceptions.NotEnoughMoneyException;
import com.example.chapter10exercise6.model.ErrorDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetail> exceptionNotEnoughMoneyHandler() {
        var errorDetail = new ErrorDetail();
        errorDetail.setMessage("Not enough money to make the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetail);
    }
}
