package com.example.demo.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Workplace;

	public interface WorkPlaceDao extends MongoRepository<Workplace,Integer> {
	    Workplace getById(int id);
	}

