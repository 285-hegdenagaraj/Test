package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.CoverLetter;
import com.example.demo.repository.CoverLetterDao;
import java.util.List;

@Service
public class CoverLetterManager implements CoverLetterService {


	CoverLetterDao coverLetterDao;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao){
		this.coverLetterDao = coverLetterDao;
	}


	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Cover Letter add");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll(), null);
	}

	@Override
	public DataResult<CoverLetter> getById(int id) {
		return new SuccessDataResult<CoverLetter>(this.coverLetterDao.getById(id), null);
	}

	@Override
	public DataResult<CoverLetter> getByCandidateId(int candidateId) {
		return new SuccessDataResult<CoverLetter>(this.coverLetterDao.getByCandidate_Id(candidateId), null);
	}
}

