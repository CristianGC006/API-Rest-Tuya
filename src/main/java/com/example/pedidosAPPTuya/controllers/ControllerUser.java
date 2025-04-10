package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.models.User;
import com.example.pedidosAPPTuya.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ControllerUser {

    @Autowired
    UserService userService;

    //Save
    @PostMapping
    public ResponseEntity<?>save(@RequestBody User requestData){
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.userService.createUser(requestData));
        }catch (Exception error){
           return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(error.getMessage());

        }
    }
    //Find all
    @GetMapping
    public ResponseEntity<?>searchAll(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.userService.searchUser());
        }catch (Exception error){
           return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(error.getMessage());
        }
    }
    //Find by id
    @GetMapping("/{id}")
    public ResponseEntity<?>searchById(@PathVariable Integer id){
        try {
          return ResponseEntity
                  .status(HttpStatus.OK)
                  .body(this.userService.searchUserById(id));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Modify
    @PutMapping("/{id}")
    public ResponseEntity<?>modify(@PathVariable Integer id, @RequestBody User requestData){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.userService.modifyUser(id,requestData));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?>delete(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.userService.deleteUser(id));
    }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}