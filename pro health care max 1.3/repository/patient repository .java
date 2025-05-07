package com.health_plus_pro1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health_plus_pro1.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
