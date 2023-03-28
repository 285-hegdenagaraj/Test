package com.example.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.core.DataResult;
import com.example.demo.core.ImageUploadService;
import com.example.demo.core.Result;
import com.example.demo.core.SuccessDataResult;
import com.example.demo.core.SuccessResult;
import com.example.demo.entity.Image;
import com.example.demo.repository.ImageDao;

import java.util.List;
import java.util.Map;

@Service
public class ImageManager implements ImageService {

	private ImageDao imageDao;
	private ImageUploadService imageUploadService;

	public ImageManager(ImageDao imageDao, ImageUploadService imageUploadService) {
		super();
		this.imageDao = imageDao;
		this.imageUploadService = imageUploadService;
	}

	@Override
	public Result add(Image image, MultipartFile imageFile) {
		image.setUrl(ImageUploadService.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Image added.");

	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image updated.");
	}

	@Override
	public Result delete(int id) {
		this.imageDao.deleteById(id);
		return new SuccessResult("Image deleted.");
	}

	@Override
	public DataResult<Image> getByUserId(int userId) {
		return new SuccessDataResult<Image>(this.imageDao.getByUser_Id(userId), null);
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(), null);
	}
}

