package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Integer>   {
}
