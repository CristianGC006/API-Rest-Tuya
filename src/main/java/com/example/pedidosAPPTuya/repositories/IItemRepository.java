package com.example.pedidosAPPTuya.repositories;

import com.example.pedidosAPPTuya.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepository extends JpaRepository<Item,Integer> {
}
