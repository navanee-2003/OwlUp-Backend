package com.owlup.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.owlup.application.entity.Camera;
import com.owlup.application.service.CameraService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CameraController {
	
	@Autowired
	CameraService cameraService;
	
	@GetMapping("/cam")
	public List<Camera> getAllCamera(){
		return cameraService.getAllCamera();
	}
	
	@GetMapping("/cam/{id}")
	public Optional<Camera> getCameraById(@PathVariable int id){
		return cameraService.getCameraById(id);
	}
	
	@PostMapping("/post-cam")
	public void postCamera(@RequestBody Camera obj) {
		cameraService.postCamera(obj);
	}
	
	
}
