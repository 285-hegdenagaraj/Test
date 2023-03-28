package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Holiday;

public interface HolidayDao extends MongoRepository<Holiday, Integer> {

	Optional<Holiday> findById(long id);

}
