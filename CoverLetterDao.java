package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.CoverLetter;

public interface CoverLetterDao extends MongoRepository<CoverLetter,Integer> {
	CoverLetter getById(int id);
	CoverLetter getByCandidate_Id(int candidate_id);
}

