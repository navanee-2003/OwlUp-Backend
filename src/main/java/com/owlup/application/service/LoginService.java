package com.owlup.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owlup.application.entity.Login;
import com.owlup.application.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository LoginRepo;
	
	public List<Login> getAllLogin(){
		return LoginRepo.findAll();
	}
	
	public void postLogin(Login obj) {
		LoginRepo.save(obj);
	}
	
	public String findPasswordByUsername(String username) {
		return LoginRepo.findPasswordByUsername(username);
	}
}

