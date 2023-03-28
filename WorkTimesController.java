package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.core.DataResult;
import com.example.demo.entity.WorkTime;
import com.example.demo.service.WorkTimeService;


@RestController
	@RequestMapping("/api/workTimes")
	public class WorkTimesController {
	    private WorkTimeService workTimeService;

	    @Autowired
	    public WorkTimesController(WorkTimeService workTimeService) {
	        super();
	        this.workTimeService = workTimeService;
	    }

	    @GetMapping("/getAll")
	    public  DataResult<List<WorkTime>> getAll() {
	        return this.workTimeService.getAll();
	    }
}
