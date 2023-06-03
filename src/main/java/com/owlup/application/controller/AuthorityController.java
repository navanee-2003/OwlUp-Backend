package com.owlup.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.owlup.application.entity.Authority;
import com.owlup.application.service.AuthorityService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthorityController {
	
	@Autowired
	AuthorityService authorityService;
	
	@GetMapping("/auth")
	public List<Authority> getAllAlerts(){
		return authorityService.getAllAuthority();
	}
	
	@PostMapping("/auth")
	public void postAuthority(@RequestBody Authority obj) {
		authorityService.postAuthority(obj);
	}
}
