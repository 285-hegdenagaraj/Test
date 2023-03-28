package com.example.demo.core;

import java.util.ArrayList;
import java.util.List;

public class FIIKPSPublicSoap12<HeaderProperty>
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


	public FIIKPSPublicSoap12(){}

	public FIIKPSPublicSoap12(String url)
	{
		this.url = url;
	}

	public FIIKPSPublicSoap12(String url,int timeOut)
	{
		this.url = url;
		this.timeOut=timeOut;
	}

	protected org.ksoap2.transport.Transport createTransport()
	{
		try
		{
			java.net.URI uri = new java.net.URI(url);
			if(uri.getScheme().equalsIgnoreCase("https"))
			{
				int port=uri.getPort()>0?uri.getPort():443;
				String path=uri.getPath();
				if(uri.getQuery()!=null && uri.getQuery()!="")
				{
					path+="?"+uri.getQuery();
				}
				
			}
			

		}
		catch (java.net.URISyntaxException e)
		{
		}
		return null;
	}

	protected FIIExtendedSoapSerializationEnvelope createEnvelope()
	{
		FIIExtendedSoapSerializationEnvelope envelope= new FIIExtendedSoapSerializationEnvelope();
		envelope.enableLogging = enableLogging;

		return envelope;
	}


	java.lang.Object getResult(@SuppressWarnings("rawtypes") java.lang.Class destObj,java.lang.Object source,String resultName,FIIExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
	{
		if(source==null)
		{
			return null;
		}
		return __envelope;
		


	}
}
