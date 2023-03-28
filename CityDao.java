package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.City;

public interface CityDao extends MongoRepository<City,Integer> {
	City getById(int id);
}


