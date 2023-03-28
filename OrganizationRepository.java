package com.example.demo.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Organization;

public interface OrganizationRepository extends MongoRepository<Organization, Integer>{
	public Optional<Organization> findById(long id);
}


