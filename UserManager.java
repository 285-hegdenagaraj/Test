package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.User;
import com.example.demo.repository.UserDao;



import java.util.List;

import javax.naming.directory.Attributes;

@Service
public abstract class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public SuccessDataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"User List");
	}

	

	@Override
	public SuccessDataResult<User> getById(int id) {
		return new SuccessDataResult<User>(this.userDao.getById(id), null);

	}

	public SuccessDataResult<User> getByEmail(Attributes email) {
		return new SuccessDataResult<User>(this.userDao.getByEmail(email), email);
	}
}

