package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.VerificationByCode;

public interface VerificationByCodeService {
	  Result add(VerificationByCode verificationByCode);
	    Result update(VerificationByCode verificationByCode);
	    Result delete(VerificationByCode verificationByCode);
	    DataResult<List<VerificationByCode>> getAll();
	    DataResult<VerificationByCode> getById(int id);
	    DataResult<VerificationByCode> getByUserId(int userId);
}
