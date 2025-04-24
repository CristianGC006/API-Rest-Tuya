package com.example.pedidosAPPTuya.services;

import com.example.pedidosAPPTuya.models.Payment;
import com.example.pedidosAPPTuya.repositories.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    IPaymentRepository repository;
    //Save
    public Payment save(Payment paymentData)throws Exception{
        try{
            return this.repository.save(paymentData);
        }
        catch (Exception e){
            throw new Exception("Error saving payment");
        }
    }
    //Find all
    public List<Payment> findAll()throws Exception{
        try{
            return this.repository.findAll();
        }
        catch (Exception e){
            throw new Exception("Error finding all payments");
        }
    }
    //Find by id
    public Payment findById(Integer id)throws Exception{
        try{
            Optional<Payment> paymentSearched=this.repository.findById(id);
            if (paymentSearched.isPresent()){
                return (Payment) paymentSearched.get();
            }else{
                throw new Exception("El usuario buscado no se encuentra en la base de datos");
            }
        }
        catch (Exception e){
            throw new Exception("Error finding payment by id");
        }
    }
    //Modify
    public Payment modify(Integer id, Payment paymentData)throws Exception{
        try{
            Optional<Payment>paymentSearched=this.repository.findById(id);
            if(paymentSearched.isPresent()){
                paymentSearched.get().setPaymenDate(paymentData.getPaymenDate());
                paymentSearched.get().setPaymentMethod(paymentData.getPaymentMethod());
            }
            return this.repository.save(paymentSearched.get());
        }
        catch (Exception e){
            throw new Exception("Error modifying payment");
        }
    }
    //Delete
    public boolean delete(Integer id)throws Exception{
        try {
            Optional<Payment> paymentSearched=this.repository.findById(id);
            if (paymentSearched.isPresent()){
                this.repository.deleteById(id);
                return true;
            }else{
                throw new Exception("pago no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
}
