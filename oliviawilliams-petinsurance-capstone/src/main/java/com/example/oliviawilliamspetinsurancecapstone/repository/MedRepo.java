package com.example.oliviawilliamspetinsurancecapstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oliviawilliamspetinsurancecapstone.model.Medicine;

@Repository
public interface MedRepo extends JpaRepository<Medicine, Long> {
	

}
