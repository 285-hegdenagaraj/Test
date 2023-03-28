package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Department;
public interface DepartmentServices {

	public Department addDepartment(Department department);
	public void deleteDepartment(long id);
	public Optional<Department> findById(long id);
	public Optional<List<Department>> getDepartments();
	public Optional<List<Department>> findByOragnizationId(long id);
	public Department addDepartment1(Department department);
}
