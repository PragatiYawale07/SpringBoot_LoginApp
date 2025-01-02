package com.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@PrimaryKeyJoinColumn
@Data
public class Teachers extends SeedMain {

	
	private int techId;
	
	private String techName;
	
}
