package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Item;
import com.example.pedidosAPPTuya.repositories.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsService {
    @Autowired
    IItemRepository repository;
    // Guardar un ítem
    public Item createItem(Item itemData) throws Exception {
        try {
            return this.repository.save(itemData);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar todos los ítems
    public List<Item> searchItems() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar un ítem por ID
    public Item searchItemById(Integer id) throws Exception {
        try {
            Optional<Item> itemSearched = this.repository.findById(id);
            if (itemSearched.isPresent()) {
                return itemSearched.get();
            } else {
                throw new Exception("El ítem buscado no se encuentra en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar un ítem por ID
    public Item modifyItem(Integer id, Item itemData) throws Exception {
        try {
            Optional<Item> itemSearched = this.repository.findById(id);
            if (itemSearched.isPresent()) {
                itemSearched.get().setItemName(itemData.getItemName());
                itemSearched.get().setItemPrice(itemData.getItemPrice());
                itemSearched.get().setItemDescription(itemData.getItemDescription());
                // Agregar más campos según sea necesario
            } else {
                throw new Exception("Ítem no encontrado");
            }
            return this.repository.save(itemSearched.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar un ítem por ID
    public boolean deleteItem(Integer id) throws Exception {
        try {
            Optional<Item> itemSearched = this.repository.findById(id);
            if (itemSearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Ítem no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
