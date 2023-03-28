package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Verification;

public interface VerificationDao extends MongoRepository<Verification,Integer> {
	Verification getById(int id);
}

