package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IDealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealerService {
    @Autowired
    IDealerRepository repository;
}
