package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Document
public class Employee {

	@Id
	
	private Long id;
	private String name;
	private int age;
	private String position;
	public long departmentId;
	public long organizationId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	public Employee(Long id, String name, int age, String position, long departmentId, long organizationId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.position = position;
		this.departmentId = departmentId;
		this.organizationId = organizationId;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + ", departmentId="
				+ departmentId + ", organizationId=" + organizationId + "]";
	}
	
}