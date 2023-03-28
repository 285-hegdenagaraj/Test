package com.example.demo.core;

	import java.util.Date;


	public interface FIIDateTimeConverter
	{
	    java.util.Date convertDateTime(String strDate);
	    java.util.Date convertTime(String strDate);
	    java.util.Date convertDate(String strDate);
	    String convertDuration(String value);
	    String getStringFromDateTime(Date value);
	    String getStringFromDate(Date value);
	    String getStringFromTime(Date value);
	    String getStringFromDuration(String value);
	}

