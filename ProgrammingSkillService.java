package com.example.demo.service;

import java.util.List;

import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.ProgrammingSkill;


public interface ProgrammingSkillService {
	 Result add(ProgrammingSkill programmingSkill);
	    SuccessDataResult<List<ProgrammingSkill>> getAll();
	    SuccessDataResult<ProgrammingSkill> getById(int id);
	    SuccessDataResult<List<ProgrammingSkill>> getByCandidateId(int candidateId);


}
