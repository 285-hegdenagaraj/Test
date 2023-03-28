package com.example.demo.service;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.Jobadvertisement;
import com.example.demo.entity.JobadvertisementInfo;

import java.util.List;
public interface JobadvertisementService {
	 com.example.demo.core.Result add (Jobadvertisement jobadvertisement);
	    Result delete(Jobadvertisement jobadvertisement);
	    Result update(Jobadvertisement jobadvertisement);
	    DataResult<List<Jobadvertisement>> getAll();
	    DataResult<List<Jobadvertisement>> getAllSorted();
	    DataResult<List<Jobadvertisement>> getAll(int pageNo, int pageSize);
	    DataResult<Jobadvertisement> getByJobAdvertName(String jobAdvertName);
	    DataResult<Jobadvertisement> getByJobAdvertNameAndJobPosition(String jobAdvertName, int jobPositionId);
	    DataResult<List<Jobadvertisement>> getByJobAdvertNameAndEmployer(String jobAdvertName, int employerId);
	    DataResult<List<Jobadvertisement>> getByJobAdvertNameAndCity(String jobAdvertName, int cityId);
	    DataResult<List<Jobadvertisement>> getByNameAndCity(String jobAdvertName, int cityId);
	    DataResult<List<Jobadvertisement>> getAllActiveJobAdverts();
	    DataResult<List<Jobadvertisement>> getAllByCreationDateAsc();
	    DataResult<List<Jobadvertisement>> getAllActiveJobAdvertByCompanyName(String companyName);
	    Result closeJobAdvert(int id);
	    Result openJobAdvert(int id);
	    Result create(JobadvertisementInfo jobadvertisementInfo);
	    DataResult<List<JobadvertisementInfo>> getInfo();
	}

