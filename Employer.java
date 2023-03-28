package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document
public class Employer extends User {

   @Id
    private String companyName;

  
    private String webAddress;

  
    private String phoneNumber;

  
    private List<Jobadvertisement> jobadvertisement;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Jobadvertisement> getJobadvertisement() {
		return jobadvertisement;
	}

	public void setJobadvertisement(List<Jobadvertisement> jobadvertisement) {
		this.jobadvertisement = jobadvertisement;
	}

	public Employer(String companyName, String webAddress, String phoneNumber,
			List<Jobadvertisement> jobadvertisement) {
		super();
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.jobadvertisement = jobadvertisement;
	}

	public Employer() {
		
	}

	@Override
	public String toString() {
		return "Employer [companyName=" + companyName + ", webAddress=" + webAddress + ", phoneNumber=" + phoneNumber
				+ ", jobadvertisement=" + jobadvertisement + "]";
	}
	
	}




