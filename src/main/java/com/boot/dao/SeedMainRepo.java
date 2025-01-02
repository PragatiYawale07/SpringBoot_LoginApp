package com.boot.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.SeedMain;
@Repository
public interface SeedMainRepo extends JpaRepository<SeedMain, Integer> {

	public SeedMain findByUserType(String utype);
	
	public SeedMain findByUserNameAndPasswordAndUserType(String uname,String pass,String utype);
}
