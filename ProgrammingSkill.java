package com.example.demo.entity;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

	
	@Data
	@Document
	public class ProgrammingSkill {

	    @Id
	
	    private int id;

	  
	    private String programmingName;

	 
	    private Candidate candidate;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProgrammingName() {
			return programmingName;
		}

		public void setProgrammingName(String programmingName) {
			this.programmingName = programmingName;
		}

		public Candidate getCandidate() {
			return candidate;
		}

		public void setCandidate(Candidate candidate) {
			this.candidate = candidate;
		}

		public ProgrammingSkill(int id, String programmingName, Candidate candidate) {
			super();
			this.id = id;
			this.programmingName = programmingName;
			this.candidate = candidate;
		}

	public ProgrammingSkill() {
		
	}

	@Override
	public String toString() {
		return "ProgrammingSkill [id=" + id + ", programmingName=" + programmingName + ", candidate=" + candidate + "]";
	}
	}
