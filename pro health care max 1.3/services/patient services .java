package com.health_plus_pro1.services;

import java.util.List;

import com.health_plus_pro1.entity.Patient;

public interface PatientServices {
	public void savePatientData(Patient p);
	public List<Patient> getAllData(Patient p);
	public void deleteOnedoc(long id);
	

}
