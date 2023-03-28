package com.example.demo.core;

import java.util.List;

import javax.naming.directory.Attributes;
import javax.naming.spi.DirStateFactory.Result;

import com.example.demo.entity.JobExperience;

public class DataResult<T> extends Result {

    private static Attributes attrs;
	private List<JobExperience> data;


    @SuppressWarnings("unchecked")
	public DataResult(T data2,boolean success, Attributes string) {
        super(success, string);
        this.data=(List<JobExperience>) data2;
    }
    public DataResult(List<JobExperience> list,boolean success) {
        super(success, getAttrs());
        this.data=list;
    }

    public List<JobExperience> getData(){
        return this.data;
    }
	public static Attributes getAttrs() {
		return attrs;
	}
	public static void setAttrs(Attributes attrs) {
		DataResult.attrs = attrs;
	}

}

