package com.example.demo.service;

import com.example.demo.core.Result;
import com.example.demo.entity.Candidate;
import com.example.demo.entity.Employer;


public interface AuthService {

    Result registerEmployer(Employer employer, String confirmPassword);
    Result registerCandidate(Candidate candidate , String confirmPassword);

}
