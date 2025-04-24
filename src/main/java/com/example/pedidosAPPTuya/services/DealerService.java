package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Dealer;
import com.example.pedidosAPPTuya.repositories.IDealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealerService {
    @Autowired
    IDealerRepository repository;
    // Guardar un dealer
    public Dealer createDealer(Dealer dealerData) throws Exception {
        try {
            return this.repository.save(dealerData);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar todos los dealers
    public List<Dealer> searchDealers() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar un dealer por ID
    public Dealer searchDealerById(Integer id) throws Exception {
        try {
            Optional<Dealer> dealerSearched = this.repository.findById(id);
            if (dealerSearched.isPresent()) {
                return dealerSearched.get();
            } else {
                throw new Exception("El dealer buscado no se encuentra en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar un dealer por ID
    public Dealer modifyDealer(Integer id, Dealer dealerData) throws Exception {
        try {
            Optional<Dealer> dealerSearched = this.repository.findById(id);
            if (dealerSearched.isPresent()) {
                dealerSearched.get().setDealerName(dealerData.getDealerName());
                dealerSearched.get().setDealerEmail(dealerData.getDealerEmail());
                dealerSearched.get().setDealerPhoneNumber(dealerData.getDealerPhoneNumber());
                // Agregar más campos según sea necesario
            } else {
                throw new Exception("Dealer no encontrado");
            }
            return this.repository.save(dealerSearched.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar un dealer por ID
    public boolean deleteDealer(Integer id) throws Exception {
        try {
            Optional<Dealer> dealerSearched = this.repository.findById(id);
            if (dealerSearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Dealer no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
