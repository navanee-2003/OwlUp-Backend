package com.owlup.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owlup.application.entity.Alerts;
import com.owlup.application.repository.AlertsRepository;

@Service
public class AlertsService {
	
	@Autowired
	AlertsRepository AlertsRepo;
	
	public List<Alerts> getAllAlerts(){
		return AlertsRepo.findAll();
	}
	
	public void postAlerts(Alerts obj) {
		AlertsRepo.save(obj);
	}

}
