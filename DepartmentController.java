package com.example.demo.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.management.AttributeNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentServices;


@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {


	@Autowired
	DepartmentServices deptS;

	@GetMapping
	public List<Department>  getDepartments()
	{
		return deptS.getDepartments().get();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Department>  getDepartmentById(@PathVariable("id") int organizationId) throws AttributeNotFoundException
	{	
		Department dept = deptS.findById(organizationId).orElseThrow(()-> new AttributeNotFoundException("Department not found"));
		return ResponseEntity.ok(dept);
	}

	@PostMapping("/save")
	public ResponseEntity<?> addDepartment(@RequestBody Department department, UriComponentsBuilder builder,
			HttpServletRequest httpRequest) {
		Department dept = deptS.addDepartment1(department);
		UriComponents components = builder.path(httpRequest.getRequestURI() + "/{id}").buildAndExpand(dept.getId());
		return ResponseEntity.created(components.toUri()).body(dept);
	}

	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteDepartmentById(@PathVariable int id) throws AttributeNotFoundException
	{
		deptS.findById(id).orElseThrow(()-> new AttributeNotFoundException("Department not found"));
		deptS.deleteDepartment(id);
		HashMap<String, Boolean> res =  new HashMap<>();
		res.put("delete", Boolean.TRUE);
		return res;

	}

	@PutMapping("/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable("id") int id,  @Validated @RequestBody Department department) throws AttributeNotFoundException
	{
		Department dept = deptS.findById(id).orElseThrow();
		department.setId((long) id);
		dept = deptS.addDepartment(department);
		return ResponseEntity.ok(dept);	
	}
}

