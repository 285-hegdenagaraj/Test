package com.example.demo.entity;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;
	
	
	
	@Data
@Document
	public class Language {
	    @Id
	  
	    private int id;

	   
	    private String language;

	 
	    private int level;

	   
	    private Candidate candidate;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public Candidate getCandidate() {
			return candidate;
		}

		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}

		public Language(int id, String language, int level, Candidate candidate) {
			super();
			this.id = id;
			this.language = language;
			this.level = level;
			this.candidate = candidate;
		}
public Language() {
	
}

@Override
public String toString() {
	return "Language [id=" + id + ", language=" + language + ", level=" + level + ", candidate=" + candidate + "]";
}
	}

