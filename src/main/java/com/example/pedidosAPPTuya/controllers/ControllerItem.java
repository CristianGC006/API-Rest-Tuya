package com.example.pedidosAPPTuya.controllers;


import com.example.pedidosAPPTuya.models.Item;
import com.example.pedidosAPPTuya.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ControllerItem {
    @Autowired
    ItemsService itemsService;

    //Save
    /*@PostMapping
    public ResponseEntity<?>save(@RequestBody Item requestData){
        /*try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.itemsService(requestData))
        }
    }*/
    //Find all
    //Find by id
    //Modify
    //Delete
}
