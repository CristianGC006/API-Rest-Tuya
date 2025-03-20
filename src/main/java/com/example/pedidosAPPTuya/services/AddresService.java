package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IAddresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddresService {
    @Autowired
    IAddresRepository repository;
}
