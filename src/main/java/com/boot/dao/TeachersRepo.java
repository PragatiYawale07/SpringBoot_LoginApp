package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.Teachers;

public interface TeachersRepo extends JpaRepository<Teachers, Integer> {

}
