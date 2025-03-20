package com.example.pedidosAPPTuya.repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    //Acá dentro del repo van las consultas personalizadas
}
