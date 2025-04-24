package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class ControllerPayment {
    @Autowired
    PaymentService paymentService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
