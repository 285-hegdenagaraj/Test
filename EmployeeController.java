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

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServices;
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	EmployeeServices empS;

	@GetMapping
	public List<Employee>  getEmployees()
	{
		return empS.getEmployees().get();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee>  getEmployeeById(@PathVariable("id") int employeeId) throws AttributeNotFoundException
	{	
		Employee emp = empS.findById(employeeId).orElseThrow(() -> new AttributeNotFoundException("Emoployee not found."));
		return ResponseEntity.ok(emp);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee, UriComponentsBuilder builder,
			HttpServletRequest httpRequest) {
		Employee emp = empS.addEmployeee(employee);
		UriComponents components = builder.path(httpRequest.getRequestURI() + "/{id}").buildAndExpand(emp.getId());
		return ResponseEntity.created(components.toUri()).body(emp);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteEmployeeById(@PathVariable int id) throws AttributeNotFoundException
	{
		empS.findById(id).orElseThrow(() -> new AttributeNotFoundException("Emoployee not found."));
		empS.deleteEmployee(id);
		HashMap<String, Boolean> res =  new HashMap<>();
		res.put("delete", Boolean.TRUE);
		return res;
				
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,  @Validated @RequestBody Employee employee) throws AttributeNotFoundException
	{
		Employee emp = empS.findById(id).orElseThrow();
		employee.setId((long) id);
		emp = empS.addEmployeee(employee);
		return ResponseEntity.ok(emp);	
	}
}

