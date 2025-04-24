package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.services.AddresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class ControllerAdddress {
    @Autowired
    AddresService addresService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
