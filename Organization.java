package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Document
public class Organization {
	
	@Id
	
	private Long id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Organization(Long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}	
	public Organization() {
		
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}




