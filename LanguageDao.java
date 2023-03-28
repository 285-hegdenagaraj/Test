package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Language;

import java.util.List;

public interface LanguageDao extends MongoRepository<Language,Integer> {
	Language getById(int id);
	List<Language> getByCandidate_Id(int candidateId);
}

