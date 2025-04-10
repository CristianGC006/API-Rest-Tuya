package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment,Integer> {

}
