package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.core.DataResult;
import com.example.demo.entity.Workplace;
import com.example.demo.service.WorkPlaceService;

@RestController
	@RequestMapping("/api/workplaces")
	public class WorkPlacesController {

	    private WorkPlaceService workPlaceService;

	    public WorkPlacesController(WorkPlaceService workPlaceService) {
	        super();
	        this.workPlaceService = workPlaceService;
	    }

	    @GetMapping("/getAll")
	   public  DataResult<List<Workplace>> getAll(){
	        return this.workPlaceService.getAll();
	    }
	}

