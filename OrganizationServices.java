package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Organization;

public interface OrganizationServices {
	public Organization addOrganization(Organization organization);
	public void deleteOrganization(long id);
	public Optional<Organization> findById(long id);
	public Optional<List<Organization>> getOrganizations();
	Organization addOrganization1(Organization organization);
}

