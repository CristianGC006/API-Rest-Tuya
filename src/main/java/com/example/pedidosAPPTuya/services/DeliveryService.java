package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Delivery;
import com.example.pedidosAPPTuya.repositories.IDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {
    @Autowired
    IDeliveryRepository repository;

    // Guardar un delivery
    public Delivery createDelivery(Delivery deliveryData) throws Exception {
        try {
            return this.repository.save(deliveryData);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar todos los deliveries
    public List<Delivery> searchDeliveries() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar un delivery por ID
    public Delivery searchDeliveryById(Integer id) throws Exception {
        try {
            Optional<Delivery> deliverySearched = this.repository.findById(id);
            if (deliverySearched.isPresent()) {
                return deliverySearched.get();
            } else {
                throw new Exception("El delivery buscado no se encuentra en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar un delivery por ID
    public Delivery modifyDelivery(Integer id, Delivery deliveryData) throws Exception {
        try {
            Optional<Delivery> deliverySearched = this.repository.findById(id);
            if (deliverySearched.isPresent()) {
                deliverySearched.get().setDeliveryDate(deliveryData.getDeliveryDate());
                deliverySearched.get().setStatusDelivery(deliveryData.getStatusDelivery());

            } else {
                throw new Exception("Delivery no encontrado");
            }
            return this.repository.save(deliverySearched.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar un delivery por ID
    public boolean deleteDelivery(Integer id) throws Exception {
        try {
            Optional<Delivery> deliverySearched = this.repository.findById(id);
            if (deliverySearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Delivery no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
