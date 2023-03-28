package com.example.demo.core;


import java.util.ArrayList;
import java.util.List;


public class FIIKPSPublicSoap<HeaderProperty>
{
	interface FIIIWcfMethod
	{
		FIIExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

		java.lang.Object ProcessResult(FIIExtendedSoapSerializationEnvelope __envelope,java.lang.Object result) throws java.lang.Exception;
	}

	String url="https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

	int timeOut=60000;

	public List< HeaderProperty> httpHeaders= new ArrayList< HeaderProperty>();
	public boolean enableLogging;


	public FIIKPSPublicSoap(){}

	public FIIKPSPublicSoap(String url)
	{
		this.url = url;
	}

	public FIIKPSPublicSoap(String url,int timeOut)
	{
		this.url = url;
		this.timeOut=timeOut;
	}

	public boolean TCKimlikNoDogrula(long parseLong, String upperCase, String upperCase2, int birthYear) {
		// TODO Auto-generated method stub
		return false;
	}
}
