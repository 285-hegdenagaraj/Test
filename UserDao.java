package com.example.demo.repository;

import javax.naming.directory.Attributes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface UserDao extends MongoRepository<User,Integer> {
	User getById(int id);
	User getByEmail(Attributes email);
}

