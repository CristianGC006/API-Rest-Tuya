package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Order;
import com.example.pedidosAPPTuya.repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepository repository;


    // Guardar una orden
    public Order createOrder(Order orderData) throws Exception {
        try {
            return this.repository.save(orderData);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar todas las órdenes
    public List<Order> searchOrders() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar una orden por ID
    public Order searchOrderById(Integer id) throws Exception {
        try {
            Optional<Order> orderSearched = this.repository.findById(id);
            if (orderSearched.isPresent()) {
                return orderSearched.get();
            } else {
                throw new Exception("La orden buscada no se encuentra en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar una orden por ID
    public Order modifyOrder(Integer id, Order orderData) throws Exception {
        try {
            Optional<Order> orderSearched = this.repository.findById(id);
            if (orderSearched.isPresent()) {
                orderSearched.get().setOrderDate(orderData.getOrderDate());
                orderSearched.get().setStatusOrder(orderData.getStatusOrder());

            } else {
                throw new Exception("Orden no encontrada");
            }
            return this.repository.save(orderSearched.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar una orden por ID
    public boolean deleteOrder(Integer id) throws Exception {
        try {
            Optional<Order> orderSearched = this.repository.findById(id);
            if (orderSearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Orden no encontrada");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
