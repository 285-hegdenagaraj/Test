package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.repository.JobExperienceDao;
import java.util.List;

@Service
public abstract class JobExperienceManager implements JobExperience {

	@SuppressWarnings("rawtypes")
	JobExperienceDao jobExperienceDao;

	@Autowired
	public JobExperienceManager(@SuppressWarnings("rawtypes") JobExperienceDao jobExperienceDao){
		this.jobExperienceDao = jobExperienceDao;
	}
	@SuppressWarnings("unchecked")

	public Result add(JobExperience jobexperience) {
		this.jobExperienceDao.save(jobexperience);
		return (Result) new SuccessResult("Programming skills added");
	}

	@SuppressWarnings("unchecked")
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll());
	}

	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>(this.jobExperienceDao.getById(id), null);
	}

	@SuppressWarnings({ "unchecked" })
	public DataResult<List<JobExperience>> getByCandidate_Id(int candidateId) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByCandidate_Id(candidateId), null);    }


}

