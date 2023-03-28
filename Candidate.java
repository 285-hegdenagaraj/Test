package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document
public class Candidate extends User {

	
@Id
	private String firstName;

	private String lastName;

	private String nationalIdentity;

	private int birthYear;

	private String phoneNumber;

	private List<CoverLetter> coverLetters;

	private List<College> College;


	private List<Language> languages;

	
	private List<ProgrammingSkill> programmingSkills;

	private List<JobExperience> jobExperiences;


	private List<SocialMediaAccount> socialMediaAccounts;


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public List<CoverLetter> getCoverLetters() {
		return coverLetters;
	}


	public void setCoverLetters(List<CoverLetter> coverLetters) {
		this.coverLetters = coverLetters;
	}


	public List<College> getCollege() {
		return College;
	}


	public void setCollege(List<College> college) {
		College = college;
	}


	public List<Language> getLanguages() {
		return languages;
	}


	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}


	public List<ProgrammingSkill> getProgrammingSkills() {
		return programmingSkills;
	}


	public void setProgrammingSkills(List<ProgrammingSkill> programmingSkills) {
		this.programmingSkills = programmingSkills;
	}


	public List<JobExperience> getJobExperiences() {
		return jobExperiences;
	}


	public void setJobExperiences(List<JobExperience> jobExperiences) {
		this.jobExperiences = jobExperiences;
	}


	public List<SocialMediaAccount> getSocialMediaAccounts() {
		return socialMediaAccounts;
	}


	public void setSocialMediaAccounts(List<SocialMediaAccount> socialMediaAccounts) {
		this.socialMediaAccounts = socialMediaAccounts;
	}


	public Candidate(String firstName, String lastName, String nationalIdentity, int birthYear, String phoneNumber,
			List<CoverLetter> coverLetters, List<com.example.demo.entity.College> college, List<Language> languages,
			List<ProgrammingSkill> programmingSkills, List<JobExperience> jobExperiences,
			List<SocialMediaAccount> socialMediaAccounts) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthYear = birthYear;
		this.phoneNumber = phoneNumber;
		this.coverLetters = coverLetters;
		this.College = college;
		this.languages = languages;
		this.programmingSkills = programmingSkills;
		this.jobExperiences = jobExperiences;
		this.socialMediaAccounts = socialMediaAccounts;
	}

	public Candidate() {

	}


	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", nationalIdentity=" + nationalIdentity
				+ ", birthYear=" + birthYear + ", phoneNumber=" + phoneNumber + ", coverLetters=" + coverLetters
				+ ", College=" + College + ", languages=" + languages + ", programmingSkills=" + programmingSkills
				+ ", jobExperiences=" + jobExperiences + ", socialMediaAccounts=" + socialMediaAccounts + "]";
	}



}

