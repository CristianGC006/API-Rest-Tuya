package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.services.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealer")
public class ControllerDealer {
    @Autowired
    DealerService dealerService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
