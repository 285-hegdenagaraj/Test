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
	public class WorkTime {

	    @Id
	   
	    private int id;

	   
	    private String workingTime;

	   
	    private List<Jobadvertisement> jobadvertisement;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getWorkingTime() {
			return workingTime;
		}

		public void setWorkingTime(String workingTime) {
			this.workingTime = workingTime;
		}

		public List<Jobadvertisement> getJobadvertisement() {
			return jobadvertisement;
		}

		public void setJobadvertisement(List<Jobadvertisement> jobadvertisement) {
			this.jobadvertisement = jobadvertisement;
		}

		public WorkTime(int id, String workingTime, List<Jobadvertisement> jobadvertisement) {
			super();
			this.id = id;
			this.workingTime = workingTime;
			this.jobadvertisement = jobadvertisement;
		}
public WorkTime() {
	
}

@Override
public String toString() {
	return "WorkTime [id=" + id + ", workingTime=" + workingTime + ", jobadvertisement=" + jobadvertisement + "]";
}

}
