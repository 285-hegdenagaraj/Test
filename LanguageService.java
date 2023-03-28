package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.entity.Language;


public interface LanguageService {
	 com.example.demo.core.Result add(Language language);
	    DataResult<List<Language>> getAll();
	    DataResult<Language> getById(int id);
	    DataResult<List<Language>> getByCandidate_Id(int candidateId);

	}

