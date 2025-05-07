package com.health_plus_pro1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health_plus_pro1.entity.Doctor;
import com.health_plus_pro1.entity.Patient;
import com.health_plus_pro1.services.DoctorServices;
import com.health_plus_pro1.services.PatientServices;

@Controller
public class PatientController {
	@Autowired
	private PatientServices patientServices;
	
	@RequestMapping("/newpat")
	public String newpat() {
		return "patient_reg";
}
	@RequestMapping("/savepatient")
	public String savepatient(Patient p) {
		
	patientServices.savePatientData(p);	
	return "patient_reg";
		
	}//http://localhost:8080/listallpat
	@RequestMapping("listallpat")
	public String getAllPatientsData(Patient p,Model m) {
		
	
		List<Patient> patients = patientServices.getAllData(p);
		m.addAttribute("patients", patients);
		
		return "list_all_pat";
		
	}
	//deletepat
	@RequestMapping("/deletepat")
	public String deletepat(@RequestParam("id") long id,Patient p,Model m) {
		patientServices.deleteOnedoc(id);
		
		List<Patient> patients = patientServices.getAllData(p);
		m.addAttribute("patients", patients);
		
		return "list_all_pat";
	}
	
}


