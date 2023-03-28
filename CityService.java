package com.example.demo.service;



import java.util.List;

import com.example.demo.core.DataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.City;

public interface CityService {
    Result add (City city);
    DataResult<List<City>> getAll();
    DataResult<City> getById(int id);

}

