package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.DataResult;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.Workplace;
import com.example.demo.repository.WorkPlaceDao;


import java.util.List;

@Service
public class WorkPlaceManager implements WorkPlaceService {


	private WorkPlaceDao workPlaceDao;

	@Autowired
	public WorkPlaceManager(WorkPlaceDao workPlaceDao) {
		super();
		this.workPlaceDao = workPlaceDao;
	}


	public DataResult<List<Workplace>> getAll() {
		return new SuccessDataResult<List<Workplace>>(this.workPlaceDao.findAll(), null);
	}
}

