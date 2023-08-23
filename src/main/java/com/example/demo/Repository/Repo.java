package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.AppEntity;

@Repository
public interface Repo extends JpaRepository<AppEntity, Integer> {

}
