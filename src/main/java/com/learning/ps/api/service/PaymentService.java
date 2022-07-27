package com.learning.ps.api.service;

import com.learning.ps.api.entity.Payment;
import com.learning.ps.api.respository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        // to generate and set auto id for transaction id
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    public String paymentProcessing(){
        // this api should be 3rd party payment gateway
        return new Random().nextBoolean()?"success":"false";
    }
}
