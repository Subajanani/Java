package com.health_plus_pro1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_plus_pro1.entity.Doctor;
import com.health_plus_pro1.repository.DoctorRepository;
@Service
public class DoctorServicesImpl implements DoctorServices {
	@Autowired
	private DoctorRepository doctorrepo;

	@Override
	public  void savedoctor(Doctor d) {
		doctorrepo.save(d);
		
		
	}

	@Override
	public List<Doctor> getAllData(Doctor d) {
		List<Doctor> doctors = doctorrepo.findAll();
		return doctors;
	}

	@Override
	public void deleteOneDoc(long id) {
		doctorrepo.deleteById(id);
		
	}

}
