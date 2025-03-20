package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepository repository;
}
