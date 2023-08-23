package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CartEntity;

public interface CartRepo extends JpaRepository<CartEntity, Integer> {

}
