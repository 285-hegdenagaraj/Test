package com.example.demo.service;


import java.util.AbstractList;
import java.util.List;

import com.example.demo.core.Result;
import com.example.demo.entity.Candidate;
import com.example.demo.entity.CandidateInfo;
import com.example.demo.entity.ResumeInfo;

public interface CandidateService {

     AbstractList<List<Candidate>> getAll();
     Result add(Candidate candidate);
     AbstractList<Candidate> getByEmail(String email);
     AbstractList<Candidate> getByNationalIdentity(String nationalIdentity);
     AbstractList<Candidate> getById(int id);
     Result delete(int id);
     AbstractList<ResumeInfo> getCandidateResume(int candidateId);
     AbstractList<List<CandidateInfo>> getInfo();


}

