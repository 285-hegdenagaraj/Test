package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.SocialMediaAccount;

import java.util.List;

public interface SocialMediaAccountDao extends MongoRepository<SocialMediaAccount,Integer> {
	List<SocialMediaAccount> getByCandidate_Id(int candidateId);
	SocialMediaAccount getById(int id);
}
