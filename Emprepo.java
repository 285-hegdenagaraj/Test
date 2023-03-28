package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Employee;

public interface Emprepo extends MongoRepository<Employee, Integer>{

}
