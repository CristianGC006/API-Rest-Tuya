package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    IPaymentRepository repository;
}
