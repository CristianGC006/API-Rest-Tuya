package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsService {
    @Autowired
    IDetailsRepository repository;
}
