package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.SeedMainRepo;
import com.boot.entity.Operation;
import com.boot.entity.SeedMain;
import com.boot.entity.Students;
import com.boot.entity.Teachers;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class SeedMainService {

	@Autowired
	public SeedMainRepo repo;
	
	public String getWelcomeMessage(String utype) {
        SeedMain user = repo.findByUserType(utype);
        
        if (user instanceof Students) {
            return "WelcomeStudent.html";
        } else if (user instanceof Teachers) {
            return "WelcomeTeacher.html";
        } else if (user instanceof Operation) {
            return "WelcomeOperationalDepartment.html";
        }else {
        	return"login.html";
        }
    }
	
	public String validateUser(HttpServletRequest req) {
		
		String uname= req.getParameter("uname");
		String pass=req.getParameter("pass");
		String usertype=req.getParameter("usertype");
		
		SeedMain seedmain=repo.findByUserNameAndPasswordAndUserType(uname, pass,usertype);
		
		if(seedmain==null) {
			return"login.html";
		}else {
			return getWelcomeMessage(usertype);
		}
	}
}
