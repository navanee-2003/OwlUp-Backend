package com.owlup.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.owlup.application.entity.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Integer> {

}
