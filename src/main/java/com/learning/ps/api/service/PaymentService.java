package com.learning.ps.api.service;

import com.learning.ps.api.entity.Payment;
import com.learning.ps.api.respository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        // to generate and set auto id for transaction id
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }
}
