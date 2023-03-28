package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.ProgrammingSkill;

import java.util.List;

public interface ProgrammingSkillDao extends MongoRepository<ProgrammingSkill,Integer> {
	ProgrammingSkill getById(int id);
	List<ProgrammingSkill> getByCandidate_Id(int candidateId);
}

