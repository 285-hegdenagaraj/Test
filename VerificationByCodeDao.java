package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.VerificationByCode;

public interface VerificationByCodeDao extends MongoRepository<VerificationByCode,Integer> {
	VerificationByCode getByUserId(int userId);
	VerificationByCode getById(int id);
}

