package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Worker extends User {
@Id
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "position")
    private String position;

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

	public Worker(int id, String email, String password, List<Image> images, String firstName, String lastName,
			String position) {
		super(id, email, password, images);
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}
public Worker() {
	
}

@Override
public String toString() {
	return "Worker [firstName=" + firstName + ", lastName=" + lastName + ", position=" + position + "]";
}

}

