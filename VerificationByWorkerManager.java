package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.VerificationByWorker;
import com.example.demo.repository.VerificationByWorkerDao;


import java.util.List;

@Service
public class VerificationByWorkerManager implements VerificationByWorkerService {

	public VerificationByWorkerDao verificationByEmployeeDao;
	private Object verificationByWorkerDao;
	@Autowired
	public VerificationByWorkerManager(VerificationByWorkerDao verificationByEmployeeDao) {
		super();
		this.verificationByEmployeeDao = verificationByEmployeeDao;
	}

	@Override
	public Result add(VerificationByWorker verificationByWorker) {
		this.verificationByEmployeeDao.save(verificationByWorker);
		return (Result) new SuccessResult();
	}

	@Override
	public Result update(VerificationByWorker verificationByWorker, int employeeId) {
		this.verificationByEmployeeDao.save(verificationByWorker);
		return (Result) new SuccessResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result delete(VerificationByWorker verificationByWorker) {
		((CrudRepository<VerificationByWorker,Integer>) this.verificationByWorkerDao).delete(verificationByWorker);
		return (Result) new SuccessResult();
	}

	@Override
	public DataResult<VerificationByWorker> getById(int id) {
		return new SuccessDataResult<VerificationByWorker>(((VerificationByWorkerDao) this.verificationByWorkerDao).getById(id), null);
	}

	@Override
	public DataResult<VerificationByWorker> getByEmployerId(int employerId) {
		return new  SuccessDataResult<VerificationByWorker>(this.verificationByEmployeeDao.getByEmployerId(employerId), null);
	}

	public Result add1(VerificationByWorker verificationByEmployee) {

		return null;
	}

	public Result update1(VerificationByWorker verificationByEmployee, int employeeId) {

		return null;
	}

	public Result delete1(VerificationByWorker verificationByEmployee) {

		return null;
	}

	@Override
	public DataResult<List<VerificationByWorker>> getAll() {

		return null;
	}


}

