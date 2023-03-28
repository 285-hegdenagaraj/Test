package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.ErrorResult;
import com.example.demo.entity.Employer;
import com.example.demo.entity.EmployerInfo;


public interface EmployerService {
	 DataResult<List<Employer>> getAll();
	    ErrorResult add(Employer employer);
	    DataResult<Employer> getByEmail(String email);
	    DataResult<List<EmployerInfo>> getDto();
	    DataResult<Employer> getById(int id);
	}

