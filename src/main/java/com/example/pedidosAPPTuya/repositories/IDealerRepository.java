package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDealerRepository extends JpaRepository<Dealer,Integer> {
}
