package com.example.demo.entity;



import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
public class EmployerInfo{
	@Id
	private String companyName;
	private String email;
	private String webAddress;
	private String phoneNumber;
	private String url;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public EmployerInfo(String companyName, String email, String webAddress, String phoneNumber, String url) {
		super();
		this.companyName = companyName;
		this.email = email;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.url = url;
	}
	public EmployerInfo() {
		
	}
	@Override
	public String toString() {
		return "EmployerInfo [companyName=" + companyName + ", email=" + email + ", webAddress=" + webAddress
				+ ", phoneNumber=" + phoneNumber + ", url=" + url + "]";
	}
}

