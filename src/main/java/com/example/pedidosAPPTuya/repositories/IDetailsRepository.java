package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailsRepository extends JpaRepository<Details,Integer> {
}
