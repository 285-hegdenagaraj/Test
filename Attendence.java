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
public class Attendence {

	@Id
	
	private int attendence_id;
	private int employee_id;
	private int type;
	private String description;
	public int getAttendence_id() {
		return attendence_id;
	}
	public void setAttendence_id(int attendence_id) {
		this.attendence_id = attendence_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Attendence(int attendence_id, int employee_id, int type, String description) {
		super();
		this.attendence_id = attendence_id;
		this.employee_id = employee_id;
		this.type = type;
		this.description = description;
	}
	public Attendence() {
		
	}
	@Override
	public String toString() {
		return "Attendence [attendence_id=" + attendence_id + ", employee_id=" + employee_id + ", type=" + type
				+ ", description=" + description + "]";
	}
	
}
