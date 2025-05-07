package com.health_plus_pro1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health_plus_pro1.entity.Doctor;
import com.health_plus_pro1.services.DoctorServices;
import com.health_plus_pro1.util.DoctorEmailService;

@Controller
public class DoctorController {
	@Autowired
	private DoctorServices doctorservices;
	@Autowired
	private DoctorEmailService drEmailServ;
	
	@RequestMapping("/view")
	public String show() {
		
		return "doctor_reg";
}
	@RequestMapping("/saveview")
	public String savedoctor(Doctor d) {
		
		doctorservices.savedoctor(d);
		
		drEmailServ.sendDocEmail(d.getEmail(), "Welcome", "Congratulations Doctor");
		
		return "doctor_reg";
		//http://localhost:8080/view
	}
	@RequestMapping("/listalldoc")
	public String listAlldoc(Doctor d,Model m) {
		
		List<Doctor> doctors = doctorservices.getAllData(d);
		m.addAttribute("doctors", doctors);
		return"list_all_doc";
		
	}
	@RequestMapping("/deletedoc")
	public String deletedoc(@RequestParam("id") long id,Doctor d, Model m) {
		 doctorservices.deleteOneDoc(id);
		 
		 
		 List<Doctor> doctors = doctorservices.getAllData(d);
			m.addAttribute("doctors", doctors);
			return"list_all_doc";
	}
}




