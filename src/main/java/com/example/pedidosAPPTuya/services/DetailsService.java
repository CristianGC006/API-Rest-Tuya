package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Details;
import com.example.pedidosAPPTuya.repositories.IDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailsService {
    @Autowired
    IDetailsRepository repository;
    // Guardar un detalle
    public Details createDetails(Details detailsData) throws Exception {
        try {
            return this.repository.save(detailsData);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar todos los detalles
    public List<Details> searchDetails() throws Exception {
        try {
            return this.repository.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Buscar un detalle por ID
    public Details searchDetailsById(Integer id) throws Exception {
        try {
            Optional<Details> detailsSearched = this.repository.findById(id);
            if (detailsSearched.isPresent()) {
                return detailsSearched.get();
            } else {
                throw new Exception("El detalle buscado no se encuentra en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Modificar un detalle por ID
    public Details modifyDetails(Integer id, Details detailsData) throws Exception {
        try {
            Optional<Details> detailsSearched = this.repository.findById(id);
            if (detailsSearched.isPresent()) {
                detailsSearched.get().setAmountItem(detailsData.getAmountItem());
                detailsSearched.get().setSubTotalItem(detailsData.getSubTotalItem());
                // Agregar más campos según sea necesario
            } else {
                throw new Exception("Detalle no encontrado");
            }
            return this.repository.save(detailsSearched.get());
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar un detalle por ID
    public boolean deleteDetails(Integer id) throws Exception {
        try {
            Optional<Details> detailsSearched = this.repository.findById(id);
            if (detailsSearched.isPresent()) {
                this.repository.deleteById(id);
                return true;
            } else {
                throw new Exception("Detalle no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
