package com.health_plus_pro1.services;

import java.util.List;

import com.health_plus_pro1.entity.Doctor;

public interface DoctorServices {
	public void savedoctor(Doctor d);
	public List<Doctor> getAllData(Doctor d);
	public void deleteOneDoc(long id);

}
