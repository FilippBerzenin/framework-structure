package com.berzenin.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.berzenin.app.model.Photo;
import com.berzenin.app.service.controller.PhotoService;

@Controller
@RequestMapping(value="/photo")
public class PhotoViewController extends GenericViewControllerImpl<Photo, PhotoService> {

	
	public 	PhotoViewController(PhotoService service) {
		page = "photo";
	}
	
    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public @ResponseBody String handleFileUpload(
            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
             try {
//            	 filesController.copyFileForlocalDirectory(file);
                	message = "ok! Test";
                	return "Ok";
            } catch (Exception e) {
                return "Вам не удалось загрузить " +  " => " + e.getMessage();
            }
        } else {
            return "Вам не удалось загрузить " +  " потому что файл пустой.";
        }
    }
}
