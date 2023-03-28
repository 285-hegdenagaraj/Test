package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.College;

import java.util.List;

public interface CollegeDao extends MongoRepository<College,Integer> {
	College getById(int id);
	List<College> getByCandidateId(int candidateId);


}

