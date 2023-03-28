package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Worker;
import com.example.demo.entity.WorkerInfo;

import java.util.List;

public interface WorkerDao  extends MongoRepository<Worker, Integer> {

	Worker getById(int id);


	@Query("Select new  kodlamaio.HRMS.entities.dtos.EmployeeDto"
			+ "(e.id,e.firstName, e.lastName,e.email, e.position, i.url) "
			+ "From Employee e Inner Join e.images i")
	List<WorkerInfo> getInfo();
}


