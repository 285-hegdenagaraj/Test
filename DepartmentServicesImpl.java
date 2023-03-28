package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;


@Service
public class DepartmentServicesImpl implements DepartmentServices {

	@Autowired
	DepartmentRepository deptR;
	
	public Department addDepartment1(Department department) {
		// TODO Auto-generated method stub
		return deptR.save(department);
	}

	@Override
	public void  deleteDepartment(long id) {
		// TODO Auto-generated method stub
		 deptR.deleteById((int) id);
	}

	@Override
	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		return deptR.findById(id);
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(deptR.findAll());
	}

	@Override
	public Optional<List<Department>> findByOragnizationId(long id) {
		// TODO Auto-generated method stub
		return deptR.findByOrganizationId(id);
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

}

