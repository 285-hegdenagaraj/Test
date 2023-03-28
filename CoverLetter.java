package com.example.demo.entity;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

	
	@Data
	@Document
	public class CoverLetter {
	    @Id
	  
	    private int id;

	    
	    private String note;

	   
	    private Candidate candidate;

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}

		public CoverLetter(int id, String note, Candidate candidate) {
			super();
			this.id = id;
			this.note = note;
			this.candidate = candidate;
		}
public CoverLetter() {
	
}
	}

