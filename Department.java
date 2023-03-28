package com.example.demo.entity;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Department {

	@Id
	private long id;
	private long organizationId;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department(long id, long organizationId, String name) {
		super();
		this.id = id;
		this.organizationId = organizationId;
		this.name = name;
	}
	public Department() {

	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", organizationId=" + organizationId + ", name=" + name + "]";
	}

}