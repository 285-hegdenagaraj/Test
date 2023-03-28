package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data

@Document

public class Verification {
	@Id
	
	private int id;


	private boolean status;

	
	private LocalDateTime createdDate = LocalDateTime.now();


	private LocalDateTime verifiedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getVerifiedDate() {
		return verifiedDate;
	}

	public void setVerifiedDate(LocalDateTime verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public Verification(int id, boolean status, LocalDateTime createdDate, LocalDateTime verifiedDate) {
		super();
		this.id = id;
		this.status = status;
		this.createdDate = createdDate;
		this.verifiedDate = verifiedDate;
	}
	public Verification() {

	}

	@Override
	public String toString() {
		return "Verification [id=" + id + ", status=" + status + ", createdDate=" + createdDate + ", verifiedDate="
				+ verifiedDate + "]";
	}

}

