package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.VerificationByCode;
import com.example.demo.repository.VerificationByCodeDao;

import java.util.List;

@Service
public class VerificationByCodeManager implements VerificationByCodeService {

	private VerificationByCodeDao verificationByCodeDao;
	@Autowired
	public VerificationByCodeManager(VerificationByCodeDao verificationByCodeDao) {
		super();
		this.verificationByCodeDao = verificationByCodeDao;
	}

	@Override
	public Result add(VerificationByCode verificationByCode) {
		this.verificationByCodeDao.save(verificationByCode);
		return (Result) new SuccessResult();
	}

	@Override
	public Result update(VerificationByCode verificationByCode) {
		this.verificationByCodeDao.save(verificationByCode);
		return (Result) new SuccessResult();
	}

	@Override
	public Result delete(VerificationByCode verificationByCode) {
		this.verificationByCodeDao.delete(verificationByCode);
		return (Result) new SuccessResult();
	}

	@Override
	public DataResult<List<VerificationByCode>> getAll() {
		return new SuccessDataResult<List<VerificationByCode>>(this.verificationByCodeDao.findAll(), null);
	}

	@Override
	public DataResult<VerificationByCode> getById(int id) {
		return new SuccessDataResult<VerificationByCode>(this.verificationByCodeDao.getById(id), null);
	}

	@Override
	public DataResult<VerificationByCode> getByUserId(int userId) {
		return null;
	}

	public Result add1(VerificationByCode verificationByCode) {

		return null;
	}

	public Result update1(VerificationByCode verificationByCode) {

		return null;
	}



}

