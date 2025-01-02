package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.StudentsRepo;
import com.boot.dao.TeachersRepo;
import com.boot.entity.Students;
import com.boot.entity.Teachers;

import jakarta.servlet.http.HttpServletRequest;
@Service
public class TeacherService {

	@Autowired
	public TeachersRepo repo;
	
	public String launchRegisterTeacher() {
		
		return "RegisterTeachers.html";
	}
	
	public String registerTeacher(HttpServletRequest req) {
		
		Teachers teach= new Teachers();
		
		teach.setUserName(req.getParameter("uname"));
		teach.setPassword(req.getParameter("pass"));
		teach.setUserType(req.getParameter("usertype"));
		teach.setTechName(req.getParameter("name"));
		teach.setTechId(Integer.parseInt(req.getParameter("id")));
		
		repo.save(teach);
		
		return"login.html";
	}
}
