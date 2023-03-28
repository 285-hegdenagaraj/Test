package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.DataResult;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.WorkTime;
import com.example.demo.entity.Workplace;
import com.example.demo.repository.WorkTimeDao;


import java.util.List;

@Service
public class WorkTimeManager implements WorkTimeService {
	private WorkTimeDao  workTimeDao ;

	@Autowired
	public WorkTimeManager(WorkTimeDao workTimeDao) {
		super();
		this.workTimeDao = workTimeDao;
	}

	@Override
	public DataResult<List<WorkTime>> getAll() {
		return new SuccessDataResult<List<WorkTime>>(this.workTimeDao.findAll(), null);
	}

}

