package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Organization;
import com.example.demo.repository.OrganizationRepository;

@Service
public class OrganizationServicesImpl implements OrganizationServices {

	@Autowired
	OrganizationRepository orgR;
	@Override
	public Organization addOrganization1(Organization organization) {
		return orgR.save(organization);		
	}

	@Override
	public void deleteOrganization(long id) {
		// TODO Auto-generated method stub
		orgR.deleteById((int) id);
	}

	@Override
	public Optional<Organization> findById(long id) {
		// TODO Auto-generated method stub
		return orgR.findById(id);
	}

	@Override
	public Optional<List<Organization>> getOrganizations() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(orgR.findAll());
	}

	@Override
	public Organization addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	

}

}
