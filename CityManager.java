package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.City;
import com.example.demo.repository.CityDao;

import java.util.List;

@Service
public class CityManager implements CityService {
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		@SuppressWarnings("unused")
		var save = this.cityDao.save(city);
		return (Result) new SuccessResult("City added.");
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), null);
	}

	@Override
	public DataResult<City> getById(int id) {
		return new SuccessDataResult<City>(cityDao.getById(id), null);



	}

}
