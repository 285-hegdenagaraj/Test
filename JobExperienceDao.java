package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.JobExperience;

import java.util.List;

public interface JobExperienceDao<S> extends MongoRepository<JobExperience,Integer> {
	com.example.demo.service.JobExperience getById(int id);
	List<com.example.demo.service.JobExperience> getByCandidate_Id(int candidateId);
	void save(Iterable<S> jobExperience);
}

