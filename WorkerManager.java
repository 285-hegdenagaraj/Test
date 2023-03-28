package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.Worker;
import com.example.demo.entity.WorkerInfo;
import com.example.demo.repository.WorkerDao;

import java.util.AbstractList;
import java.util.List;

@Service
public class WorkerManager implements WorkerService {

    private WorkerDao workerDao;

    @Autowired
    public WorkerManager(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }


    public Result add(Worker worker) {
        this.workerDao.save(worker);
        return (Result) new SuccessResult ("Worker added.");
    }

    @Override
    public SuccessDataResult<Worker> getById(int id) {
        return  new SuccessDataResult<Worker>(this.workerDao.getById(id), null);
    }

    @Override
    public SuccessDataResult<List<Worker>> getAll() {
       
        return new SuccessDataResult<List<Worker>>(this.workerDao.findAll(), null);

    }

    public SuccessDataResult<List<WorkerInfo>> getInfo() {
        return   new SuccessDataResult<List<WorkerInfo>>(this.workerDao.getInfo(), null);
    }

	@Override
	public Result add1(Worker worker) {
		
		return null;
	}

	
	public AbstractList<List<WorkerInfo>> getInfo1() {

		return null;
	}

}