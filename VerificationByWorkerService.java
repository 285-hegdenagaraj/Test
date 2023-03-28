package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.VerificationByWorker;
public interface VerificationByWorkerService {
	Result add(VerificationByWorker verificationByEmployee);
    Result update(VerificationByWorker verificationByEmployee, int employeeId);
    Result delete(VerificationByWorker verificationByEmployee);
    DataResult<List<VerificationByWorker>> getAll();
    DataResult<VerificationByWorker> getById(int id);
    DataResult<VerificationByWorker> getByEmployerId(int employerId);
}
