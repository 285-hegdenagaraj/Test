package com.example.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.Attendence;
public interface AttendenceDao extends MongoRepository<Attendence, Integer>{

}
