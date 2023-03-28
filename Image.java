package com.example.demo.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@Document
public class Image {

    @Id
   
    private int id;

   
    private String url;

   
    private LocalDate createdDate = LocalDate.now();

    
    private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Image(int id, String url, LocalDate createdDate, User user) {
		super();
		this.id = id;
		this.url = url;
		this.createdDate = createdDate;
		this.user = user;
	}
public Image() {
	
}

@Override
public String toString() {
	return "Image [id=" + id + ", url=" + url + ", createdDate=" + createdDate + ", user=" + user + "]";
}
}

