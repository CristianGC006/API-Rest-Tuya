package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    IStoreRepository repository;
}
