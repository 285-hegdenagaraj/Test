package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.entity.User;


public interface UserService {
	 DataResult<List<User>> getAll();
	    @SuppressWarnings("rawtypes")
		Result add(User user);
	    SuccessDataResult<User> getById(int id);
	    SuccessDataResult<User> getByEmail(String email);

}
