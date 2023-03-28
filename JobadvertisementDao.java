package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Jobadvertisement;
import com.example.demo.entity.JobadvertisementInfo;

import java.util.List;

	public interface JobadvertisementDao extends MongoRepository<Jobadvertisement,Integer> {
	    Jobadvertisement getByJobadvertisementName(String jobAdvertName);
	    Jobadvertisement getById(int id);
	    Jobadvertisement getByJobadvertisementNameAndJobPosition_Id(String jobadvertisementName, int jobPositionId);
	    List<Jobadvertisement> getByJobadvertisementNameAndEmployer_Id(String jobadvertisementName, int employerId);
	    List<Jobadvertisement> getByJobadvertisementNameAndCityId(String jobadvertisementName, int cityId);

	    @Query("From JobAdvert where jobadvertisementName=:jobadvertisementName and city.id=:cityId")
	    List<Jobadvertisement> getByNameAndCity(String jobadvertisementName, int cityId);

	    @Query("From JobAdvert where isOpen = true") 
	    List<Jobadvertisement> getAllActiveJobadvertisements();

	    @Query("From JobAdvert where isOpen = true Order By publishedDate asc ") 
	    List<Jobadvertisement> getAllByCreationDateAsc();


	    @Query("From JobAdvert where isOpen = true and employer.companyName=:companyName") 
	    List<Jobadvertisement> getAllActiveJobadvertisementByEmployer_CompanyName(String companyName);

	    @Query("Select new  kodlamaio.HRMS.entities.dtos.JobAdvertDto"
	            + "(j.jobPosition.id,j.employer.id,j.city.id,j.workPlace.id,j.workTime.id," +
	            "j.salaryMax,j.salaryMin,j.openPositionCount,j.description,j.applicationDeadline,j.isOpen) "
	            + "From JobAdvert j")
	    List<JobadvertisementInfo> getInfo();
		Jobadvertisement getOne(int id);
}
