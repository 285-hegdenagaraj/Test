package com.example.demo.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Holiday {
	
@Id
private int holiday_id;
private int employee_id;
private String Duration;
private int date;
public int getHoliday_id() {
	return holiday_id;
}
public void setHoliday_id(int holiday_id) {
	this.holiday_id = holiday_id;
}
public int getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}
public String getDuration() {
	return Duration;
}
public void setDuration(String duration) {
	Duration = duration;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public Holiday(int holiday_id, int employee_id, String duration, int date) {
	super();
	this.holiday_id = holiday_id;
	this.employee_id = employee_id;
	Duration = duration;
	this.date = date;
}
public Holiday() {
	
}
@Override
public String toString() {
	return "Holiday [holiday_id=" + holiday_id + ", employee_id=" + employee_id + ", Duration=" + Duration + ", date="
			+ date + "]";
}
public Map<String, ?> getId() {
	// TODO Auto-generated method stub
	return null;
}
public static void setId(long id) {
	// TODO Auto-generated method stub
	
}


}
