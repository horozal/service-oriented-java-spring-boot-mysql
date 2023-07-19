package com.java.example.serviceoriented.service;

import com.java.example.serviceoriented.repository.EntityRepository;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
    private final EntityRepository entityRepository;
    
    public EntityService(EntityRepository repository) {
        this.entityRepository = repository;
    }
    
    // Custom service methods and business logic can be added here

}