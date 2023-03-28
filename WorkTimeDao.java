package com.example.demo.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.WorkTime;

	public interface WorkTimeDao extends MongoRepository<WorkTime,Integer> {
	    WorkTime getById(int id);
	}

