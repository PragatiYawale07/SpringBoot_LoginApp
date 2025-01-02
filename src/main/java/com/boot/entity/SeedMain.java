package com.boot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import lombok.Data;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)
@Data
public class SeedMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seedId;

    private String userName;

    private String password;
    
    private String userType;
}
