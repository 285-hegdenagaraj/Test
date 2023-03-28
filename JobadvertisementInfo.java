package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class JobadvertisementInfo{
	@Id
    private int jobPositionId;
    private int employerId;
    private int cityId;
    private int workPlaceId;
    private int workTimeId;
    private int salaryMax;
    private int salaryMin;
    private int openPositionCount;
    private String description;
    private LocalDate applicationDeadline;
    private boolean isOpen;
	public int getJobPositionId() {
		return jobPositionId;
	}
	public void setJobPositionId(int jobPositionId) {
		this.jobPositionId = jobPositionId;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getWorkPlaceId() {
		return workPlaceId;
	}
	public void setWorkPlaceId(int workPlaceId) {
		this.workPlaceId = workPlaceId;
	}
	public int getWorkTimeId() {
		return workTimeId;
	}
	public void setWorkTimeId(int workTimeId) {
		this.workTimeId = workTimeId;
	}
	public int getSalaryMax() {
		return salaryMax;
	}
	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}
	public int getSalaryMin() {
		return salaryMin;
	}
	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}
	public int getOpenPositionCount() {
		return openPositionCount;
	}
	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public JobadvertisementInfo(int jobPositionId, int employerId, int cityId, int workPlaceId, int workTimeId,
			int salaryMax, int salaryMin, int openPositionCount, String description, LocalDate applicationDeadline,
			boolean isOpen) {
		super();
		this.jobPositionId = jobPositionId;
		this.employerId = employerId;
		this.cityId = cityId;
		this.workPlaceId = workPlaceId;
		this.workTimeId = workTimeId;
		this.salaryMax = salaryMax;
		this.salaryMin = salaryMin;
		this.openPositionCount = openPositionCount;
		this.description = description;
		this.applicationDeadline = applicationDeadline;
		this.isOpen = isOpen;
	}
public JobadvertisementInfo() {
	
}
@Override
public String toString() {
	return "JobadvertisementInfo [jobPositionId=" + jobPositionId + ", employerId=" + employerId + ", cityId=" + cityId
			+ ", workPlaceId=" + workPlaceId + ", workTimeId=" + workTimeId + ", salaryMax=" + salaryMax
			+ ", salaryMin=" + salaryMin + ", openPositionCount=" + openPositionCount + ", description=" + description
			+ ", applicationDeadline=" + applicationDeadline + ", isOpen=" + isOpen + "]";
}
}
