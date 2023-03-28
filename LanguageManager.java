package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.Language;
import com.example.demo.repository.LanguageDao;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return (Result) new SuccessResult("Language added.");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new DataResult<List<Language>>(this.languageDao.findAll(), false, null);
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>(this.languageDao.getById(id), null);
	}

	@Override
	public DataResult<List<Language>> getByCandidate_Id(int candidateId) {
		return new SuccessDataResult<List<Language>>(this.languageDao.getByCandidate_Id(candidateId), null);    }
}

