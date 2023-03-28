package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.Attendence;
import com.example.demo.entity.Department;
import com.example.demo.repository.AttendenceDao;

@Service
public abstract class AttendenceManager implements AttendanceService {

	@Autowired
	AttendenceDao adao;
	public Attendence addattendence(Attendence attendence) {
		return adao.save(attendence);
	}

	@Override
	public void  deleteAttendence(long id) {
		adao.deleteById((int) id);
	}

	public Optional<Attendence> findById(long id) {
		return adao.findById((int) id);
	}

	public Optional<List<Attendence>> getAttendence() {
		return Optional.ofNullable(adao.findAll());
	}

	public Optional<List<Attendence>> findByAttendenceId(long id) {
		return ((AttendenceManager) adao).findByAttendenceId(id);
	}

	public Department addAttendence(Attendence Attendence) {
		return null;
	}

	@Override
	public Result add(Attendence attendence) {
		return null;
	}

	@Override
	public DataResult<List<Attendence>> getAll() {
		return null;
	}

	@Override
	public DataResult<Attendence> getById(int id) {
		return null;
	}

}



