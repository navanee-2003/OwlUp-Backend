package com.owlup.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owlup.application.entity.Authority;
import com.owlup.application.repository.AuthorityRepository;

@Service
public class AuthorityService {
	
	@Autowired
	AuthorityRepository AuthorityRepo;
	
	public List<Authority> getAllAuthority(){
		return AuthorityRepo.findAll();
	}
	
	public void postAuthority(Authority obj) {
		AuthorityRepo.save(obj);
	}
}
