package com.example.demo.core;

import java.util.Map;

import javax.naming.directory.Attributes;

public class ErrorDataResult<T> extends DataResult<T> {

	    public ErrorDataResult(T data, Attributes string) {
	        super(data,false, string);
	    }

	    public ErrorDataResult(T data){
	        super(data,false, getAttrs());
	    }

	    public ErrorDataResult(Map<String, String> validationErrors, Attributes message){
	        super(null,false,message);
	    }

	    public  ErrorDataResult(){
	        super(null,false);
	    }

	}

