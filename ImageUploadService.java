package com.example.demo.core;
import org.springframework.web.multipart.MultipartFile;
import java.util.Map;

public interface ImageUploadService {

	@SuppressWarnings("rawtypes")
	DataResult<Map> uploadImageFile(MultipartFile imageFile);

	static String get(String string) {
		return null;
	}

}

