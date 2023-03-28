package com.example.demo.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Employer;
import com.example.demo.entity.EmployerInfo;

import java.util.List;

import javax.naming.directory.Attributes;

	public interface EmployerDao extends MongoRepository<Employer,Integer> {
	    Employer findByEmail(Attributes email);
	    Employer getById(int id);

	    @Query("Select new  kodlamaio.HRMS.entities.dtos.EmployerDto"
	            + "(e.companyName,e.email, e.webAddress, e.phoneNumber, i.url) "
	            + "From Employer e Inner Join e.images i")
	    List<EmployerInfo> getInfo();
		Object findByEmail(String email);



}
