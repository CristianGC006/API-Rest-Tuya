package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Delivery;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRepository extends JpaRepository<Delivery, Integer> {
}
