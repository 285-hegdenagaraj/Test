package com.example.demo.service;

import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.Verification;

public interface VerificationService {
	Result add(Verification verification);
    Result update(Verification verification);
    Result delete(Verification verification);
    DataResult<List<Verification>> getAll();
    DataResult<Verification> getById(int id);
}
