package com.example.demo.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.VerificationByWorker;

	public interface VerificationByWorkerDao extends MongoRepository<VerificationByWorker,Integer> {
	    VerificationByWorker getByEmployerId(int employerId);
	    VerificationByWorker getById(int id);
	}

