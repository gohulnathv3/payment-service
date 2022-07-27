package com.learning.ps.api.controller;

import com.learning.ps.api.entity.Payment;
import com.learning.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

}
