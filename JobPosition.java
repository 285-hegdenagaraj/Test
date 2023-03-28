package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	
	@Data
	@Document
	public class JobPosition {

	    @Id
	
	    private int id;

	  
	    private String title;

	 
	    private List<Jobadvertisement> jobadvertisement;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<Jobadvertisement> getJobadvertisement() {
			return jobadvertisement;
		}

		public void setJobadvertisement(List<Jobadvertisement> jobadvertisement) {
			this.jobadvertisement = jobadvertisement;
		}

		public JobPosition(int id, String title, List<Jobadvertisement> jobadvertisement) {
			super();
			this.id = id;
			this.title = title;
			this.jobadvertisement = jobadvertisement;
		}
	
public JobPosition(){
	
}

@Override
public String toString() {
	return "JobPosition [id=" + id + ", title=" + title + ", jobadvertisement=" + jobadvertisement + "]";

}
}