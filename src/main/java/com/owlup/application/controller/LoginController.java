package com.owlup.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.owlup.application.entity.Login;
import com.owlup.application.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public List<Login> getAllAlerts(){
		return loginService.getAllLogin();
	}
	
	@PostMapping("/login")
	public void postCamera(@RequestBody Login obj) {
		loginService.postLogin(obj);
	}
	
	@GetMapping("/login/{username}")
	public String findPasswordByUsername(@PathVariable String username) {
		return loginService.findPasswordByUsername(username);
	}
}
