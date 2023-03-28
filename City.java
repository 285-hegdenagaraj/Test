package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class City {
    @Id
  
    private int id;

    
    private String cityName;

  
    private List<Jobadvertisement> jobAdverts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Jobadvertisement> getJobAdverts() {
		return jobAdverts;
	}

	public void setJobAdverts(List<Jobadvertisement> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}

	public City(int id, String cityName, List<Jobadvertisement> jobAdverts) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.jobAdverts = jobAdverts;
	}
public City() {
	
}

@Override
public String toString() {
	return "City [id=" + id + ", cityName=" + cityName + ", jobAdverts=" + jobAdverts + "]";
}

}

