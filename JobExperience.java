package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@Document
	public class JobExperience {

	    @Id
	    
	    private int id;

	   
	    private String workplace;

	  
	    private LocalDate startingDate;

	   
	    private LocalDate endDate;

	    
	    
	    private Candidate candidate;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getWorkplace() {
			return workplace;
		}

		public void setWorkplace(String workplace) {
			this.workplace = workplace;
		}

		public LocalDate getStartingDate() {
			return startingDate;
		}

		public void setStartingDate(LocalDate startingDate) {
			this.startingDate = startingDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public Candidate getCandidate() {
			return candidate;
		}

		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}

		public JobExperience(int id, String workplace, LocalDate startingDate, LocalDate endDate, Candidate candidate) {
			super();
			this.id = id;
			this.workplace = workplace;
			this.startingDate = startingDate;
			this.endDate = endDate;
			this.candidate = candidate;
		}
public JobExperience() {
	
}

@Override
public String toString() {
	return "JobExperience [id=" + id + ", workplace=" + workplace + ", startingDate=" + startingDate + ", endDate="
			+ endDate + ", candidate=" + candidate + "]";
}
	}

