package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.Operation;

public interface OperationsRepo extends JpaRepository<Operation, Integer> {

}
