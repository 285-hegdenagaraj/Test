package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.Verification;
import com.example.demo.repository.VerificationDao;

import java.util.List;

@Service
public class VerificationManager implements VerificationService {

	private VerificationDao verificationDao;

	@Autowired
	public VerificationManager(VerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}


	public Result add1(Verification verification) {
		this.verificationDao.save(verification);
		return (Result) new SuccessResult();
	}

	@Override
	public Result update(Verification verification) {
		this.verificationDao.save(verification);
		return (Result) new SuccessResult();
	}

	@Override
	public Result delete(Verification verification) {
		this.verificationDao.delete(verification);
		return (Result) new SuccessResult();
	}

	@Override
	public DataResult<List<Verification>> getAll() {
		return new SuccessDataResult<List<Verification>>(this.verificationDao.findAll(), null);
	}

	@Override
	public DataResult<Verification> getById(int id) {
		return new SuccessDataResult<Verification>(this.verificationDao.getById(id), null);
	}


	@Override
	public Result add(Verification verification) {

		return null;
	}


	public Result update1(Verification verification) {

		return null;
	}


	public Result delete1(Verification verification) {

		return null;
	}
}

