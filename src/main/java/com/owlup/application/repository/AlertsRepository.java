package com.owlup.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.owlup.application.entity.Alerts;

@Repository
public interface AlertsRepository extends JpaRepository<Alerts, Integer> {

}
