package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.OperationsRepo;
import com.boot.dao.TeachersRepo;
import com.boot.entity.Operation;
import com.boot.entity.Teachers;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class OperationService {

	@Autowired
	public OperationsRepo repo;
	
	public String launchRegisterOperation() {
		
		return "RegisterOperations.html";
	}
	
	public String registerOperation(HttpServletRequest req) {
		
		Operation oper= new Operation();
		
		oper.setUserName(req.getParameter("uname"));
		oper.setPassword(req.getParameter("pass"));
		oper.setUserType(req.getParameter("usertype"));
		oper.setOperaName(req.getParameter("name"));
		oper.setOperaId(Integer.parseInt(req.getParameter("id")));
		
		repo.save(oper);
		
		return"login.html";
	}
}
