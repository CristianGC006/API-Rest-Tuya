package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/")
public class ControllerStore {
    @Autowired
    StoreService storeService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
