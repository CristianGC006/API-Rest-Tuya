package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddresRepository extends JpaRepository<Address,Integer> {
}
