package com.java.example.serviceoriented.repository;

import com.java.example.serviceoriented.model.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<SampleEntity, Long> {
    // Additional custom queries can be added here
}