package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.JobPosition;
import com.example.demo.entity.User;



public interface JobPositionDao extends MongoRepository<JobPosition,Integer> {
	JobPosition getByTitle(String title);
	JobPosition getById(int id);

}

