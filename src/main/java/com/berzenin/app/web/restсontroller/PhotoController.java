package com.berzenin.app.web.restсontroller;

import javax.annotation.security.PermitAll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.berzenin.app.model.Photo;
import com.berzenin.app.service.controller.PhotoService;

@RestController
@RequestMapping(value="/api/photo")
public class PhotoController extends GenericControllerImpl<Photo, PhotoService> {
	
	public PhotoController(PhotoService service) {
		super(service);
	}	
	
	@PermitAll
	@PostMapping(
			produces = "application/json"
			)
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/uploadFile/")
	public Photo addPhotoWithParemetrs(
			@RequestParam("file") MultipartFile file,
			@RequestParam("merch_id") Long merch_Id,
			@RequestParam("object_id") Long object_id,
			@RequestParam("date") String date
			){
		return null;	}
	}
