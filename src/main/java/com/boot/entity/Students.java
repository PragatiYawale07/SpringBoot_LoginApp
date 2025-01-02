package com.boot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@PrimaryKeyJoinColumn
@Data
public class Students extends SeedMain{

	
	private int studentId;
	
	private String studName;
	

}
