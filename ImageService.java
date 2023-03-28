package com.example.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.core.DataResult;
import com.example.demo.entity.Image;

public interface ImageService {
	  com.example.demo.core.Result add(Image image, MultipartFile imageFile);
	    com.example.demo.core.Result update(Image image);
	    com.example.demo.core.Result delete(int id);
	    DataResult<Image> getByUserId(int userId);
	    DataResult<List<Image>> getAll();
	}

