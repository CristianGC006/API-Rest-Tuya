package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    @Autowired
    IItemRepository repository;
}
