package com.example.demo.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document

public class SocialMediaAccount {

    @Id
   
    private int id;

   
    private String name;

  
    private String link;

    
    private Candidate candidate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public SocialMediaAccount(int id, String name, String link, Candidate candidate) {
		super();
		this.id = id;
		this.name = name;
		this.link = link;
		this.candidate = candidate;
	}


public SocialMediaAccount() {
	
}

@Override
public String toString() {
	return "SocialMediaAccount [id=" + id + ", name=" + name + ", link=" + link + ", candidate=" + candidate + "]";
}
}

