package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.College;

public interface CollegeService {
	  Result add(College college);
	    DataResult<List<College>> getAll();
	    DataResult<College> getById(int id);
	    DataResult<List<College>> getByCandidateId(int candidateId);
	}


