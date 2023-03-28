package com.example.demo.core;

import javax.naming.directory.Attributes;
import javax.naming.spi.DirStateFactory.Result;

public class ErrorResult extends Result {

    public ErrorResult(String string) {
        super(false,null);
    }

    public ErrorResult(Attributes confirmPassword){
        super(false,confirmPassword);

    }

	public boolean isSuccess() {
		
		return false;
	}

}