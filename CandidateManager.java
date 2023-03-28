package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.core.CheckMernisService;
import com.example.demo.entity.Candidate;
import com.example.demo.repository.CandidateDao;
import java.util.Objects;

@Service
public abstract class CandidateManager implements CandidateService {


	@SuppressWarnings("unused")
	private CheckMernisService checkMernisService;
	private CandidateDao candidateDao;
	@SuppressWarnings("unused")
	private ImageService imageService;
	@SuppressWarnings("unused")
	private CoverLetterService coverLetterService;
	@SuppressWarnings("unused")
	private JobExperience jobExperience;
	@SuppressWarnings("unused")
	private CollegeService collegeService;
	@SuppressWarnings("unused")
	private LanguageService languageService;
	@SuppressWarnings("unused")
	private ProgrammingSkillService programmingSkillService;
	@SuppressWarnings("unused")
	private SocialMediaAccountService socialMediaAccountService;

	public CandidateManager(CandidateDao candidateDao,CheckMernisService checkMernisService,
			CoverLetterService coverLetterService, JobExperience jobExperienceService, CollegeService collegeService,
			LanguageService languageService, ProgrammingSkillService programmingSkillService,
			SocialMediaAccountService socialMediaAccountService,ImageService imageService) {
		super();
		this.candidateDao = candidateDao;
		this.checkMernisService = checkMernisService;
		this.imageService = imageService;
		this.coverLetterService = coverLetterService;
		this.jobExperience = jobExperienceService;
		this.collegeService = collegeService;
		this.languageService = languageService;
		this.programmingSkillService = programmingSkillService;
		this.socialMediaAccountService = socialMediaAccountService;
	}


	@SuppressWarnings("unused")
	private boolean validationForCandidate(Candidate candidate){
		if (Objects.isNull(candidate.getNationalIdentity()) || Objects.isNull(candidate.getFirstName())
				|| Objects.isNull(candidate.getLastName()) || Objects.isNull(candidate.getEmail())
				|| Objects.isNull(candidate.getPassword()) || Objects.isNull(candidate.getBirthYear())) {

			return false;
		}
		return true;
	}


	@SuppressWarnings("unused")
	private boolean checkIfEmailExists(String email){
		if(this.candidateDao.findByEmail(email) != null){
			return false;
		}
		return true;
	}


}
