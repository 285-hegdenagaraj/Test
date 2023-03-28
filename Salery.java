package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class Salery {

	@Id
	

	private int employee_id;
	private long salery;
	private String description;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public long getSalery() {
		return salery;
	}
	public void setSalery(long salery) {
		this.salery = salery;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Salery(int employee_id, long salery, String description) {
		super();
		this.employee_id = employee_id;
		this.salery = salery;
		this.description = description;
	}
	public Salery() {

	}
	@Override
	public String toString() {
		return "Salery [employee_id=" + employee_id + ", salery=" + salery + ", description=" + description + "]";
	}
}
