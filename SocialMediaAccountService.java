package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.SocialMediaAccount;

public interface SocialMediaAccountService {
	 DataResult add(SocialMediaAccount socialMediaAccount);
	    SuccessDataResult<List<SocialMediaAccount>> getAll();
	    SuccessDataResult<List<SocialMediaAccount>> getByCandidate_Id(int candidateId);
	    SuccessDataResult<SocialMediaAccount> getById(int id);
}
