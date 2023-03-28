package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data

@Document
public class Jobadvertisement {

    @Id
   
    private int id;


    private Employer employer;

    
    private JobPosition jobPosition;

    private City city;

    private WorkTime workTime;

    private Workplace workPlace;


    private String jobAdvertName;

  
    private int salaryMax;

    
    private int salaryMin;

  
    private String description;

    
    private int openPositionCount;

    private LocalDate applicationDeadline;

  
    private LocalDate publishedDate;

   
    private boolean isOpen;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public WorkTime getWorkTime() {
		return workTime;
	}

	public void setWorkTime(WorkTime workTime) {
		this.workTime = workTime;
	}

	public Workplace getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(Workplace workPlace) {
		this.workPlace = workPlace;
	}

	public String getJobAdvertName() {
		return jobAdvertName;
	}

	public void setJobAdvertName(String jobAdvertName) {
		this.jobAdvertName = jobAdvertName;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Jobadvertisement(int id, Employer employer, JobPosition jobPosition, City city, WorkTime workTime,
			Workplace workPlace, String jobAdvertName, int salaryMax, int salaryMin, String description,
			int openPositionCount, LocalDate applicationDeadline, LocalDate publishedDate, boolean isOpen) {
		super();
		this.id = id;
		this.employer = employer;
		this.jobPosition = jobPosition;
		this.city = city;
		this.workTime = workTime;
		this.workPlace = workPlace;
		this.jobAdvertName = jobAdvertName;
		this.salaryMax = salaryMax;
		this.salaryMin = salaryMin;
		this.description = description;
		this.openPositionCount = openPositionCount;
		this.applicationDeadline = applicationDeadline;
		this.publishedDate = publishedDate;
		this.isOpen = isOpen;
	}
public Jobadvertisement() {
	
}

@Override
public String toString() {
	return "Jobadvertisement [id=" + id + ", employer=" + employer + ", jobPosition=" + jobPosition + ", city=" + city
			+ ", workTime=" + workTime + ", workPlace=" + workPlace + ", jobAdvertName=" + jobAdvertName
			+ ", salaryMax=" + salaryMax + ", salaryMin=" + salaryMin + ", description=" + description
			+ ", openPositionCount=" + openPositionCount + ", applicationDeadline=" + applicationDeadline
			+ ", publishedDate=" + publishedDate + ", isOpen=" + isOpen + "]";
}

}