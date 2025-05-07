package com.health_plus_pro1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health_plus_pro1.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
