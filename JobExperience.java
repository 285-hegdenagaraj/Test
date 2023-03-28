package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;

public interface JobExperience {
	com.example.demo.core.Result add(JobExperience jobExperience);
    DataResult<List<JobExperience>> getAll();
    DataResult<JobExperience> getById(int id);
    DataResult<List<JobExperience>> getByCandidate_Id(int candidateId);
}

