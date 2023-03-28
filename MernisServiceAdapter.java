package com.example.demo.core;

	import org.springframework.stereotype.Service;

import com.example.demo.entity.Candidate;

	@Service
	public class MernisServiceAdapter implements CheckMernisService {
	    @Override
	    public boolean checkIfRealTcNo(Candidate candidate) {

	        FIIKPSPublicSoap client = new FIIKPSPublicSoap();

	        boolean serviceResult=false;

	        try {

	            serviceResult = client.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalIdentity()),
	                    candidate.getFirstName().toUpperCase(),
	                    candidate.getLastName().toUpperCase(),
	                    candidate.getBirthYear());



	        } catch (Exception e) {

	            System.out.println("Not a valid person");

	        }

	        return serviceResult;
	    }
	}


