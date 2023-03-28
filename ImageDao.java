package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Image;

public interface ImageDao extends MongoRepository<Image,Integer> {
	Image getById(int id);
	Image getByUser_Id(int userId);

}

