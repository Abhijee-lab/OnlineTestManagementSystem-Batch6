package com.capgemini.onlinetestmanagementsystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinetestmanagementsystem.entity.*;
public interface IAdminRepository extends JpaRepository<Admin, String>{
	
	public Admin findAdminByAdminName(String adminName);

}
