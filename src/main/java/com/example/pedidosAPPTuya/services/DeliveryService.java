package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    @Autowired
    IDeliveryRepository repository;
}
