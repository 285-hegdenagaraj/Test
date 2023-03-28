package com.example.demo.core;

import java.util.List;
import javax.naming.directory.Attributes;
import com.example.demo.entity.User;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data, Object string) {
        super(data,true, (Attributes) string);
    }

    public SuccessDataResult(T data){
        super(data,true, getAttrs());
    }

    public SuccessDataResult(Attributes message){
        super(null,true,message);
    }

    public  SuccessDataResult(){
        super(null,true);
    }

	

	public void SuccessDataResult(List<User> findAll, String string) {
		// TODO Auto-generated constructor stub
	}

	

}

