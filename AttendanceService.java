package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.Attendence;


public interface AttendanceService {
	 Result add (Attendence attendence);
	    DataResult<List<Attendence>> getAll();
	    DataResult<Attendence> getById(int id);
		void deleteAttendence(long id);

	}

