package com.capgemini.onlinetestmanagementsystem.service;

import java.math.BigInteger;
import java.util.List;



import com.capgemini.onlinetestmanagementsystem.entity.TestEntity;

public interface IAdminService 
{
	

	public TestEntity addTest(TestEntity test);
	public TestEntity updateTest(BigInteger testId, TestEntity test);
	public TestEntity deleteTest(BigInteger testId);
	public List<TestEntity> fetchAll();
	public TestEntity findById(BigInteger testId);
	
	
}
