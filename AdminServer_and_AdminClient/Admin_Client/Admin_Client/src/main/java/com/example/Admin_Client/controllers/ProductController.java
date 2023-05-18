package com.example.Admin_Client.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Admin_Client.models.Product;
import com.example.Admin_Client.repositories.ProductRepository;

@RestController
//@RequestMapping("/product")
@CacheConfig(cacheNames = "product")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/addProducts")
    @Cacheable
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping(value="/getproducts")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(value="/getProductById/{productId}")
    @Cacheable
    public Optional<Product> getProductById(@PathVariable("productId") int productId) {
        
            Optional<Product> product = productRepository.findById(productId);
            return product;
            
    }

}
