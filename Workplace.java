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
public class Workplace {

    @Id
 
    private int id;

   
    private String workplace;

   
    private List<Jobadvertisement> jobAdverts;

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

	public List<Jobadvertisement> getJobAdverts() {
		return jobAdverts;
	}

	public void setJobAdverts(List<Jobadvertisement> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}

	public Workplace(int id, String workplace, List<Jobadvertisement> jobAdverts) {
		super();
		this.id = id;
		this.workplace = workplace;
		this.jobAdverts = jobAdverts;
	}
public Workplace() {
}

@Override
public String toString() {
	return "Workplace [id=" + id + ", workplace=" + workplace + ", jobAdverts=" + jobAdverts + "]";
}
}
