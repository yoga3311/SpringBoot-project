package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.model.Pms;

public interface PmsRepo extends JpaRepository<Pms,Integer>{

    
}