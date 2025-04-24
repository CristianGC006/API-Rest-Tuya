package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Store;
import com.example.pedidosAPPTuya.repositories.IStoreRepository;
import jdk.jshell.spi.ExecutionControlProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    @Autowired
    IStoreRepository repository;

    //Save
    public Store createStore(Store storeData)throws Exception{
        try{
            //Validar los datos de entrada
            return this.repository.save(storeData);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //fin All
    public List<Store> searchedStore() throws Exception{
        try {
            return this.repository.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //find by id
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

    //Update by Id
    public Store modifyStore(Integer id,Store storeData) throws Exception{
        try{
            Optional<Store> storeSearched=this.repository.findById(id);
            if (storeSearched.isPresent()){
                storeSearched.get().setStoreName(storeData.getStoreName());
                storeSearched.get().setStoreAddres(storeData.getStoreAddres());
                storeSearched.get().setStorePhoneNumber(storeData.getStorePhoneNumber());
            }else{
                throw new Exception("Tienda no encontrado");
            }
            return this.repository.save(storeSearched.get());
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Delete by id
    public boolean delete(Integer id)throws Exception{
        try{
          Optional<Store> storeSearched=this.repository.findById(id);
            if (storeSearched.isPresent()){
                this.repository.deleteById(id);
                return true;
            }else{
                throw new Exception("Tienda no encontrada");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
