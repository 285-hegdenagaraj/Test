package com.example.demo.service;

import com.example.demo.core.DataResult;
import com.example.demo.entity.WorkTime;

import java.util.List;
public interface WorkTimeService {
	 DataResult<List<WorkTime>> getAll();
}
