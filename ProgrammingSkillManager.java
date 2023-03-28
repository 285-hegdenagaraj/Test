package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.ProgrammingSkill;
import com.example.demo.repository.ProgrammingSkillDao;


import java.util.List;

@Service
public class ProgrammingSkillManager implements ProgrammingSkillService {
	private ProgrammingSkillDao programmingSkillDao;

	@Autowired
	public ProgrammingSkillManager(ProgrammingSkillDao programmingSkillDao) {
		super();
		this.programmingSkillDao = programmingSkillDao;
	}

	@Override
	public Result add(ProgrammingSkill programmingSkill) {
		this.programmingSkillDao.save(programmingSkill);
		return (Result) new SuccessResult("Programming skills added");
	}

	@Override
	public SuccessDataResult<List<ProgrammingSkill>> getAll() {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.findAll(), null);
	}

	@Override
	public SuccessDataResult<ProgrammingSkill> getById(int id) {
		return new SuccessDataResult<ProgrammingSkill>(this.programmingSkillDao.getById(id), null);
	}

	@Override
	public SuccessDataResult<List<ProgrammingSkill>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.getByCandidate_Id(candidateId), null);
	}

}

