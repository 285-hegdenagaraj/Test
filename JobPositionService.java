package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.JobPosition;


public interface JobPositionService {

    SuccessDataResult<List<JobPosition>> getAll();
    DataResult add(JobPosition jobPosition);
    SuccessDataResult<JobPosition> getByTitle(String title);
    SuccessDataResult<JobPosition> getById(int id);

}
