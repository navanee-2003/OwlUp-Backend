package com.owlup.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.owlup.application.entity.Alerts;
import com.owlup.application.service.AlertsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AlertsController {
	@Autowired
	AlertsService alertsService;
	
	@GetMapping("/alerts")
	public List<Alerts> getAllAlerts(){
		return alertsService.getAllAlerts();
	}
	
	@PostMapping("/alerts")
	public void postAlerts(@RequestBody Alerts obj) {
		alertsService.postAlerts(obj);
	}
}
