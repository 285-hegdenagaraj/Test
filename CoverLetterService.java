package com.example.demo.service;



import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.entity.CoverLetter;


public interface CoverLetterService {
    com.example.demo.core.Result add(CoverLetter coverLetter);
    DataResult<List<CoverLetter>> getAll();
    DataResult<CoverLetter> getById(int id);
    DataResult<CoverLetter> getByCandidateId(int candidateId);
}

