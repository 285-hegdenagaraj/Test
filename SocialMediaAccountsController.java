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
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.SocialMediaAccount;
import com.example.demo.service.SocialMediaAccountService;


@RestController
	@RequestMapping("/api/socialMediaAccounts")
	public class SocialMediaAccountsController {

	    private SocialMediaAccountService socialMediaAccountService;

	    @Autowired
	    public SocialMediaAccountsController(SocialMediaAccountService socialMediaAccountService) {
	        super();
	        this.socialMediaAccountService = socialMediaAccountService;
	    }

	    @SuppressWarnings("rawtypes")
		@PostMapping("/add")
	    DataResult add(@RequestBody SocialMediaAccount socialMediaAccount) {
	        return this.socialMediaAccountService.add(socialMediaAccount);
	    }

	    @GetMapping("/getByCandidateId")
	    public SuccessDataResult<List<SocialMediaAccount>> getByCandidateId(@RequestParam int candidateId){
	        return this.socialMediaAccountService.getByCandidate_Id(candidateId);
	    }


	}

