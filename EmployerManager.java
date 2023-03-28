package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.ErrorResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.Employer;
import com.example.demo.entity.EmployerInfo;
import com.example.demo.repository.EmployerDao;
import java.util.List;
import java.util.Objects;

import javax.naming.directory.Attributes;

@Service
public abstract class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	private boolean checkIfEmailExists(String email) {
		if(this.employerDao.findByEmail(email) != null) {
			return false;
		}
		return true;
	}



	private boolean validationForEmployer(Employer employer) {
		if (Objects.isNull(employer.getCompanyName()) || Objects.isNull(employer.getWebAddress()) ||
				Objects.isNull(employer.getEmail())  || Objects.isNull(employer.getPhoneNumber()) ||
				Objects.isNull(employer.getPassword())){
			return false;
		}

		return true;
	}


	
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employer List");
	}

	@Override
	public ErrorResult add(Employer employer) {
		if(!this.checkIfEmailExists(employer.getEmail())){
			return new ErrorResult("This email address already exists");
		}
		if(!this.validationForEmployer(employer)) {
			return new ErrorResult("You have entered incomplete information. Please check your information again.");
		}
		return null;
	}
	public DataResult<Employer> getByEmail(Attributes email) {
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email), email);
	}

	@Override
	public DataResult<List<EmployerInfo>> getDto() {
		return new SuccessDataResult<List<EmployerInfo>>(this.employerDao.getInfo(), null);
	}

	@Override
	public DataResult<Employer> getById(int id) {
		return new SuccessDataResult<Employer>(this.employerDao.getById(id), null);    }


}

