package com.example.demo.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

	public Optional<Employee> findById(long id);
	public Optional<List<Employee>> findByOrganizationId(long id);
	public List<Employee> findByDepartmentId(long id);

}


