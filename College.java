package com.example.demo.entity;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

	
	@Data
@Document
	public class College {

	    @Id
	
	    private int id;

	    private String CollegeName;

	   
	    private String department;

	    private LocalDate startingDate;

	    private LocalDate graduationDate;

	
	    private Candidate candidate;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSchoolName() {
			return CollegeName;
		}

		public void setSchoolName(String schoolName) {
			this.CollegeName = schoolName;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public LocalDate getStartingDate() {
			return startingDate;
		}

		public void setStartingDate(LocalDate startingDate) {
			this.startingDate = startingDate;
		}

		public LocalDate getGraduationDate() {
			return graduationDate;
		}

		public void setGraduationDate(LocalDate graduationDate) {
			this.graduationDate = graduationDate;
		}

		public Candidate getCandidate() {
			return candidate;
		}

		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}

		public College(int id, String schoolName, String department, LocalDate startingDate, LocalDate graduationDate,
				Candidate candidate) {
			super();
			this.id = id;
			this.CollegeName = schoolName;
			this.department = department;
			this.startingDate = startingDate;
			this.graduationDate = graduationDate;
			this.candidate = candidate;
		}
public College() {
	
}

@Override
public String toString() {
	return "College [id=" + id + ", schoolName=" + CollegeName + ", department=" + department + ", startingDate="
			+ startingDate + ", graduationDate=" + graduationDate + ", candidate=" + candidate + "]";
}
	}

