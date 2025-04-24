package com.example.pedidosAPPTuya.controllers;


import com.example.pedidosAPPTuya.models.Item;
import com.example.pedidosAPPTuya.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ControllerItem {
    @Autowired
    ItemsService itemsService;
    // Save
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Item requestData) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.itemsService.createItem(requestData));
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
                    .body(this.itemsService.searchItems());
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
                    .body(this.itemsService.searchItemById(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    // Modify
    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@PathVariable Integer id, @RequestBody Item requestData) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.itemsService.modifyItem(id, requestData));
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
                    .body(this.itemsService.deleteItem(id));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
