package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Store;
import com.example.pedidosAPPTuya.repositories.IStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    @Autowired
    IStoreRepository repository;

    public Store createStore(Store storeData)throws Exception{
        try{
            //Validar los datos de entrada
            return this.repository.save(storeData);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Buscar todos los registros
    public List<Store> searchUser() throws Exception{
        try {
            return this.repository.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Buscar por id
    public Store searchStoreById(Integer id)throws Exception{
        try{
            Optional<Store> storeSearched=this.repository.findById(id);
            if (storeSearched.isPresent()){
                return (Store) storeSearched.get();
            }else{
                throw new Exception("El usuario buscado no se encuentra en la base de datos");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //Metodo para modificar por id

}
