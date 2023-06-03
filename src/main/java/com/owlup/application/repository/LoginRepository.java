package com.owlup.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.owlup.application.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
	
	@Query("SELECT u.password FROM Login u WHERE u.username = ?1")
    String findPasswordByUsername(String username);
	
}
