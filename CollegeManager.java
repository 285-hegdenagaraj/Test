package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.College;
import com.example.demo.repository.CollegeDao;

import java.util.List;

@Service
public class CollegeManager implements CollegeService {

	private CollegeDao collegeDao;
	public CollegeManager(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}

	@Override
	public Result add(College college) {
		this.collegeDao.save(college);
		return (Result) new SuccessResult("New college added.");
	}

	@Override
	public DataResult<List<College>> getAll() {
		return new SuccessDataResult<List<College>>(this.collegeDao.findAll(), null);
	}

	@Override
	public DataResult<College> getById(int id) {
		return new SuccessDataResult<College>(this.collegeDao.getById(id), null);
	}

	@Override
	public DataResult<List<College>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<College>>(this.collegeDao.getByCandidateId(candidateId), null);    }

}

