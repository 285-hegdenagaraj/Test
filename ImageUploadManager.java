package com.example.demo.core;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class ImageUploadManager<Cloudinary> implements ImageUploadService {

    private Cloudinary cloudinary;


    @SuppressWarnings("rawtypes")
	@Override
    public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
       
        
        return new ErrorDataResult<>();
    }

}

