package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class ControllerDelivery {
    @Autowired
    DeliveryService deliveryService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
