package com.example.demo.service;

import java.util.List;

import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.Worker;
import com.example.demo.entity.WorkerInfo;

public interface WorkerService {
	Result add(Worker worker);
    SuccessDataResult<Worker> getById(int id);
    SuccessDataResult<List<Worker>> getAll();
    SuccessDataResult<List<WorkerInfo>> getInfo();
	Result add1(Worker worker);
}


