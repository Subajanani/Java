package com.health_plus_pro1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_plus_pro1.entity.Patient;
import com.health_plus_pro1.repository.PatientRepository;
@Service
public class PatientServicesImpl implements PatientServices {
	@Autowired
	private PatientRepository patientrepo;
	 

	@Override
	public void savePatientData(Patient p) {
		patientrepo.save(p);

	}

	@Override
	public List<Patient> getAllData(Patient p) {
		
		List<Patient> patients = patientrepo.findAll();
		return patients;
	}

	@Override
	public void deleteOnedoc(long id) {
		patientrepo.deleteById(id);
		
	}

}
