package com.example.pedidosAPPTuya.controllers;


import com.example.pedidosAPPTuya.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ControllerOrder {
    @Autowired
    OrderService orderService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
