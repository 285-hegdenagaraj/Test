package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Holiday;


public interface HolidayService {
	public Holiday addHoliday1(Holiday holiday);
	public void deleteHoliday(long id);
	public Optional<Holiday> findById(long id);
	public Optional<List<Holiday>> getHolidays();
	Holiday addHoliday(Holiday holiday);
	public Optional<List<Holiday>> findById(int id);
}



