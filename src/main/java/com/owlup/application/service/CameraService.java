package com.owlup.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owlup.application.entity.Camera;
import com.owlup.application.repository.CameraRepository;

@Service
public class CameraService {
	
	@Autowired
	CameraRepository CameraRepo;
	
	public List<Camera> getAllCamera(){
		return CameraRepo.findAll();
	}
	
	public Optional<Camera> getCameraById(int id) {
		return CameraRepo.findById(id);
	}
	
	public void postCamera(Camera obj) {
		CameraRepo.save(obj);
	}
}
