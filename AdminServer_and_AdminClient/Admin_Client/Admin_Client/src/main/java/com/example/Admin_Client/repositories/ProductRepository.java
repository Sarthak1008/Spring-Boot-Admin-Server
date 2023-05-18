package com.example.Admin_Client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Admin_Client.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
