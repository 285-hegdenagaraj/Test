package com.example.demo.service;
import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.entity.Workplace;

public interface WorkPlaceService {
	 DataResult<List<Workplace>> getAll();
}
