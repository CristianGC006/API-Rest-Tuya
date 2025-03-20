package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepository repository;
}
