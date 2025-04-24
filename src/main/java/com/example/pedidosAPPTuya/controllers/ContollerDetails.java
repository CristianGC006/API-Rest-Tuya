package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.services.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class ContollerDetails {
    @Autowired
    DetailsService detailsService;
    //Save
    //Find all
    //Find by id
    //Modify
    //Delete
}
