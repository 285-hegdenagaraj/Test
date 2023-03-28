package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Holiday;

import com.example.demo.repository.HolidayDao;


public abstract class HolidayServiceImpl implements HolidayService {
	@Autowired
	HolidayDao hr;
	public Holiday addHoliday11(Holiday holiday) {
		return hr.save(holiday);		
	}

	public void deleteHoliday1(long id) {
		hr.deleteById((int) id);
	}

	public Optional<Holiday> findById(long id) {
		
		return hr.findById(id);
	}

	public Optional<List<Holiday>> getOrganizations() {
		
		return Optional.ofNullable(hr.findAll());
	}

	public Optional<List<Holiday>> getHolidays() {
		
		return Optional.empty();
	}


}
