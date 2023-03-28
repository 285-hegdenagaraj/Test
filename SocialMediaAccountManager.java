package com.example.demo.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.core.DataResult;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.SocialMediaAccount;
import com.example.demo.repository.SocialMediaAccountDao;


import java.util.List;

	@Service
	public abstract class SocialMediaAccountManager implements SocialMediaAccountService {
	    private SocialMediaAccountDao socialMediaAccountDao;
	    @Autowired
	    public SocialMediaAccountManager(SocialMediaAccountDao socialMediaAccountDao) {
	        super();
	        this.socialMediaAccountDao = socialMediaAccountDao;
	    }


	    @Override
	    public SuccessDataResult<List<SocialMediaAccount>> getAll() {
	        return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.findAll(), null);
	    }

	    @Override
	    public SuccessDataResult<List<SocialMediaAccount>> getByCandidate_Id(int candidateId) {
	        return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.getByCandidate_Id(candidateId), null);
	    }

	    @Override
	    public SuccessDataResult<SocialMediaAccount> getById(int id) {
	        return new SuccessDataResult<SocialMediaAccount>(this.socialMediaAccountDao.getById(id), null);
	    }

	}

