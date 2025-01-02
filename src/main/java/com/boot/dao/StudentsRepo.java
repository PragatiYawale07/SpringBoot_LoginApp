package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.Students;

public interface StudentsRepo extends JpaRepository<Students, Integer>{

	
	
}
