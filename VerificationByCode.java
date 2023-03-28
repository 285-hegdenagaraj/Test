package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

@Data

@Document

public class VerificationByCode extends Verification {
@Id
	private int userId;

	private String code;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public VerificationByCode(int id, boolean status, LocalDateTime createdDate, LocalDateTime verifiedDate, int userId,
			String code) {
		super(id, status, createdDate, verifiedDate);
		this.userId = userId;
		this.code = code;
	}
public VerificationByCode(int i, Object code2) {
	
}

@Override
public String toString() {
	return "VerificationByCode [userId=" + userId + ", code=" + code + "]";
}

}
