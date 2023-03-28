package com.example.demo.entity;

import java.awt.Image;
import java.util.List;

import javax.persistence.Id;

import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
public class ResumeInfo {
@Id
    private User user;
    private Image image;
    private CoverLetter coverLetter;
    private List<College> colleges;
    private List<ProgrammingSkill>	programmingSkills;
    private List<Language> languages;
    private List<JobExperience> jobExperiences;
    private List<SocialMediaAccount> socialMediaAccounts;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public CoverLetter getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(CoverLetter coverLetter) {
		this.coverLetter = coverLetter;
	}
	public List<College> getColleges() {
		return colleges;
	}
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	public List<ProgrammingSkill> getProgrammingSkills() {
		return programmingSkills;
	}
	public void setProgrammingSkills(List<ProgrammingSkill> programmingSkills) {
		this.programmingSkills = programmingSkills;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
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
	public ResumeInfo(User user, Image image, CoverLetter coverLetter, List<College> colleges,
			List<ProgrammingSkill> programmingSkills, List<Language> languages, List<JobExperience> jobExperiences,
			List<SocialMediaAccount> socialMediaAccounts) {
		super();
		this.user = user;
		this.image = image;
		this.coverLetter = coverLetter;
		this.colleges = colleges;
		this.programmingSkills = programmingSkills;
		this.languages = languages;
		this.jobExperiences = jobExperiences;
		this.socialMediaAccounts = socialMediaAccounts;
	}
	public ResumeInfo() {
		
	}
	@Override
	public String toString() {
		return "Resume [user=" + user + ", image=" + image + ", coverLetter=" + coverLetter + ", colleges=" + colleges
				+ ", programmingSkills=" + programmingSkills + ", languages=" + languages + ", jobExperiences="
				+ jobExperiences + ", socialMediaAccounts=" + socialMediaAccounts + "]";
	}
	
}


