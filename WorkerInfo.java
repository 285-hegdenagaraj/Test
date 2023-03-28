package com.example.demo.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
public class WorkerInfo {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String position;
	private String email;
	private String  url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public WorkerInfo(int id, String firstName, String lastName, String position, String email, String url) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.email = email;
		this.url = url;
	}
	@Override
	public String toString() {
		return "WorkerInfo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", position="
				+ position + ", email=" + email + ", url=" + url + "]";
	}
}

