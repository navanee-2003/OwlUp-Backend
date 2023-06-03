package com.owlup.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.owlup.application.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

}
