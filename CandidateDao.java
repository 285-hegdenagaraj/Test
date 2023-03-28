package com.example.demo.repository;

import com.example.demo.entity.Candidate;
import com.example.demo.entity.CandidateInfo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateDao extends MongoRepository<Candidate,Integer> {

	Candidate findByEmail(String email);
	Candidate findByNationalIdentity(String nationalIdentity);
	Candidate getById(int id);
	Candidate deleteById(int id);

	@Query("Select new  kodlamaio.HRMS.entities.dtos.CandidateDto"
			+ "(c.firstName, c.lastName, c.email,c.phoneNumber, i.url) "
			+ "From Candidate c Inner Join c.images i")
	List<CandidateInfo> getInfo();
}

