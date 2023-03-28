package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.core.DataResult;
import com.example.demo.core.ErrorResult;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.Jobadvertisement;
import com.example.demo.entity.JobadvertisementInfo;
import com.example.demo.repository.CityDao;
import com.example.demo.repository.EmployerDao;
import com.example.demo.repository.JobPositionDao;
import com.example.demo.repository.JobadvertisementDao;
import com.example.demo.repository.WorkPlaceDao;
import com.example.demo.repository.WorkTimeDao;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobadvertisementManager implements JobadvertisementService {

	private JobadvertisementDao jobAdvertDao;
	private JobPositionDao jobPositionDao;
	private EmployerDao employerDao;
	private CityDao cityDao;
	private WorkTimeDao workTimeDao;
	private WorkPlaceDao workPlaceDao;
	private Jobadvertisement save;

	@Autowired

	public void JobAdvertManager(JobadvertisementDao jobAdvertDao, JobPositionDao jobPositionDao, EmployerDao employerDao,
			CityDao cityDao, WorkPlaceDao workPlaceDao, WorkTimeDao workTimeDao) {

		this.jobAdvertDao = jobAdvertDao;
		this.jobPositionDao = jobPositionDao;
		this.employerDao = employerDao;
		this.cityDao = cityDao;
		this.workTimeDao = workTimeDao;
		this.workPlaceDao = workPlaceDao;

	}

	@Override
	public Result add(Jobadvertisement jobadvertisement) {
		save = this.jobAdvertDao.save(jobadvertisement);
		return  (Result) new SuccessResult("Job Advert added");
	}

	@Override
	public Result delete(Jobadvertisement jobAdvert) {
		this.jobAdvertDao.delete(jobAdvert);
		return (Result) new SuccessResult("Job Advert deleted");

	}

	@Override
	public Result update(Jobadvertisement jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return (Result) new SuccessResult("Job Advert updated");
	}

	@Override
	public DataResult<List<Jobadvertisement>> getAll() {
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.findAll(), null);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"jobAdvertName");
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.findAll(sort), null);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo,pageSize);
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.findAll(pageable).getContent(), null);
	}

	@Override
	public DataResult<Jobadvertisement> getByJobAdvertName(String jobAdvertName) {
		return new SuccessDataResult<Jobadvertisement>(this.jobAdvertDao.getByJobadvertisementName(jobAdvertName), jobAdvertName);
	}

	@Override
	public DataResult<Jobadvertisement> getByJobAdvertNameAndJobPosition(String jobAdvertName, int jobPositionId) {
		return new SuccessDataResult<Jobadvertisement>(this.jobAdvertDao.getByJobadvertisementNameAndJobPosition_Id(jobAdvertName, jobPositionId), jobAdvertName);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getByJobAdvertNameAndEmployer(String jobAdvertName, int employerId) {
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.getByJobadvertisementNameAndEmployer_Id(jobAdvertName, employerId), jobAdvertName);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getByJobAdvertNameAndCity(String jobAdvertName, int cityId) {
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.getByJobadvertisementNameAndCityId(jobAdvertName, cityId), jobAdvertName);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getByNameAndCity(String jobAdvertName, int cityId) {
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.getByNameAndCity(jobAdvertName, cityId), jobAdvertName);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getAllActiveJobAdverts() {
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.getAllActiveJobadvertisements(), null);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getAllByCreationDateAsc() {
		return new SuccessDataResult<List<Jobadvertisement>>(this.jobAdvertDao.getAllByCreationDateAsc(), null);
	}

	@Override
	public DataResult<List<Jobadvertisement>> getAllActiveJobAdvertByCompanyName(String companyName) {
		return new SuccessDataResult<List<Jobadvertisement>>(
				this.jobAdvertDao.getAllActiveJobadvertisementByEmployer_CompanyName(companyName), companyName);
	}

	@Override
	public Result closeJobAdvert(int id) {
		@SuppressWarnings("deprecation")
		Jobadvertisement jobAdvert = jobAdvertDao.getOne(id);

		jobAdvert.setOpen(false);
		update(jobAdvert);
		return (Result) new SuccessResult("Job Advert has been closed");
	}

	@Override
	public Result openJobAdvert(int id) {
		@SuppressWarnings("deprecation")
		Jobadvertisement jobAdvert = jobAdvertDao.getOne(id);

	
		jobAdvert.setOpen(true);
		update(jobAdvert);
		return (Result) new SuccessResult("Job Advert has been opened");
	}

	@Override
	public Result create(JobadvertisementInfo jobAdvertDto) {

		Jobadvertisement jobAdvert = new Jobadvertisement();
		jobAdvert.setId(0);
		jobAdvert.setJobPosition(this.jobPositionDao.getById(jobAdvertDto.getJobPositionId()));
		jobAdvert.setEmployer(this.employerDao.getById(jobAdvertDto.getEmployerId()));
		jobAdvert.setCity(this.cityDao.getById(jobAdvertDto.getCityId()));
		jobAdvert.setWorkTime(this.workTimeDao.getById(jobAdvertDto.getWorkTimeId()));
		jobAdvert.setWorkPlace(this.workPlaceDao.getById(jobAdvertDto.getWorkPlaceId()));
		jobAdvert.setSalaryMin(jobAdvertDto.getSalaryMin());
		jobAdvert.setSalaryMax(jobAdvertDto.getSalaryMax());
		jobAdvert.setOpenPositionCount(jobAdvertDto.getOpenPositionCount());
		jobAdvert.setDescription(jobAdvertDto.getDescription());
		jobAdvert.setPublishedDate(LocalDate.now());
		jobAdvert.setApplicationDeadline(jobAdvertDto.getApplicationDeadline());
		jobAdvert.setOpen(true);
		this.jobAdvertDao.save(jobAdvert);
		return (Result) new SuccessResult("Job advertisement added.");

	}

	public DataResult<List<JobadvertisementInfo>> getInfo() {
		return new SuccessDataResult<List<JobadvertisementInfo>>(this.jobAdvertDao.getInfo(), null);
	}


}

