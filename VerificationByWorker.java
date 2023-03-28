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

public class VerificationByWorker extends Verification {
 @Id
    private int employerId;

    
    private Integer workerId;

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public Integer getWorkerId() {
		return workerId;
	}

	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
	}

	public VerificationByWorker(int id, boolean status, LocalDateTime createdDate, LocalDateTime verifiedDate,
			int employerId, Integer workerId) {
		super(id, status, createdDate, verifiedDate);
		this.employerId = employerId;
		this.workerId = workerId;
	}
public VerificationByWorker() {
	
}

@Override
public String toString() {
	return "VerificationByWorker [employerId=" + employerId + ", workerId=" + workerId + "]";
}

}

