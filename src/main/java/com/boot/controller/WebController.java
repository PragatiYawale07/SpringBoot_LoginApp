package com.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.service.OperationService;
import com.boot.service.SeedMainService;
import com.boot.service.StudentService;
import com.boot.service.TeacherService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class WebController {

	
	@Autowired
	public SeedMainService seedServ;
	
	@Autowired
	public StudentService studServ;
	
	@Autowired
	public TeacherService teachServ;
	
	@Autowired
	public OperationService operaServ;
	
	@RequestMapping("/")
	public String entryPoint() {
		
		return"login.html";
	}
	
	
	@RequestMapping("/login")
	public String validate(HttpServletRequest req) {
		
	return seedServ.validateUser(req);
		
	}
	
	@RequestMapping("/registerStudents")
	public String  launchStudentRegi(String registerstud) {
		return studServ.launchRegisterStudent();
		
	}
	
	@RequestMapping("/registerStud")
	public String registerStudents(HttpServletRequest req) {
		
		return studServ.registerStudent(req);
		
	}
	
	@RequestMapping("/registerTeacher")
	public String  launchteacherRegi(String registerteach) {
		return teachServ.launchRegisterTeacher();
		
	}
	
	@RequestMapping("/registerTeach")
	public String registerTeachers(HttpServletRequest req) {
		
		return teachServ.registerTeacher(req);
		
	}
	
	@RequestMapping("/registerOperation")
	public String  launchOperationRegi(String registeropera) {
		return operaServ.launchRegisterOperation();
		
	}
	
	@RequestMapping("/registerOpeation")
	public String registerOperations(HttpServletRequest req) {
		
		return operaServ.registerOperation(req);
		
	}
}
