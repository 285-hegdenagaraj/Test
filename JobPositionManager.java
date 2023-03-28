package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.core.ErrorResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.JobPosition;
import com.example.demo.repository.JobPositionDao;

@Service
public abstract class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	private boolean checkIfPositionExists(String jobPosition) {
		if(this.jobPositionDao.getByTitle(jobPosition) != null) {
			return false;
		}
		return true;
	}

	@Override
	public SuccessDataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"Job List");

	}


	@Override
	public SuccessDataResult<JobPosition> getByTitle(String title) {
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByTitle(title), title);
	}

	@Override
	public SuccessDataResult<JobPosition> getById(int id) {
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getById(id), null);
	}


}

