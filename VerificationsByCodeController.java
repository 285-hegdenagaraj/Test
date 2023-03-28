package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.VerificationByCode;
import com.example.demo.service.VerificationByCodeService;

@RestController
	@RequestMapping("/api/verificationsByCode")
	public class VerificationsByCodeController {
	    private VerificationByCodeService verificationByCodeService;

	    @Autowired
	    public VerificationsByCodeController(VerificationByCodeService verificationByCodeService) {
	        super();
	        this.verificationByCodeService = verificationByCodeService;
	    }

	    @PostMapping("/update")
	    public Result update(@RequestBody VerificationByCode verificationByCode) {
	        return this.verificationByCodeService.update(verificationByCode);
	    }

	    @PostMapping("/delete")
	    public Result delete(@RequestBody VerificationByCode verificationByCode) {
	        return this.verificationByCodeService.delete(verificationByCode);
	    }

	    @GetMapping("/getAll")
	    public DataResult<List<VerificationByCode>> getAll() {
	        return this.verificationByCodeService.getAll();
	    }

	    @GetMapping("/getById")
	    public DataResult<VerificationByCode> getById(@RequestParam int id) {
	        return this.verificationByCodeService.getById(id);
	    }

	}

