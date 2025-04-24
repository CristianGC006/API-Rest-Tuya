package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Address;
import com.example.pedidosAPPTuya.repositories.IAddresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddresService {
    @Autowired
    IAddresRepository repository;

    // Guardar una dirección
    public Address createAddres(Address addresData) throws Exception {
        try {
            return this.repository.save(addresData);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar todas las direcciones
    public List<Address> searchAddres() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar una dirección por ID
    public Address searchAddresById(Integer id) throws Exception {
        try {
            Optional<Address> addresSearched = this.repository.findById(id);
            if (addresSearched.isPresent()) {
                return addresSearched.get();
            } else {
                throw new Exception("La dirección buscada no se encuentra en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar una dirección por ID
    public Address modifyAddres(Integer id, Address addresData) throws Exception {
        try {
            Optional<Address> addresSearched = this.repository.findById(id);
            if (addresSearched.isPresent()) {
                addresSearched.get().setAddresStreet(addresData.getAddresStreet());
                addresSearched.get().setAddressCity(addresData.getAddressCity());
                addresSearched.get().setAddressPostalCode(addresData.getAddressPostalCode());
                addresSearched.get().setAddressCountry(addresData.getAddressCountry());
            } else {
                throw new Exception("Dirección no encontrada");
            }
            return this.repository.save(addresSearched.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar una dirección por ID
    public boolean deleteAddres(Integer id) throws Exception {
        try {
            Optional<Address> addresSearched = this.repository.findById(id);
            if (addresSearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Dirección no encontrada");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
