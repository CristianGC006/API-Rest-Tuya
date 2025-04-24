package com.example.pedidosAPPTuya.controllers;

import com.example.pedidosAPPTuya.models.Payment;
import com.example.pedidosAPPTuya.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class ControllerPayment {
    @Autowired
    PaymentService paymentService;
    // Save
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Payment requestData) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.paymentService.save(requestData));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Find all
    @GetMapping
    public ResponseEntity<?> searchAll() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.paymentService.findAll());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Find by id
    @GetMapping("/{id}")
    public ResponseEntity<?> searchById(@PathVariable Integer id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.paymentService.findById(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modify
    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@PathVariable Integer id, @RequestBody Payment requestData) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.paymentService.modify(id, requestData));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.paymentService.delete(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
