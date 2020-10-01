package com.capgemini.onlinetestmanagementsystem.service;

import java.math.BigInteger;
import java.util.List;

import com.capgemini.onlinetestmanagementsystem.entity.Question;
import com.capgemini.onlinetestmanagementsystem.entity.*;
import com.capgemini.onlinetestmanagementsystem.entity.TestEntity;

public interface IAdminService 
{
	

	public TestEntity addTest(TestEntity test);
	public TestEntity updateTest(BigInteger testId, TestEntity test);
	public TestEntity deleteTest(BigInteger testId);
	public List<TestEntity> fetchAll();
	public TestEntity findById(BigInteger testId);
	
	Admin loginAdmin(String adminName,String adminPassword);
	Admin getAdmin(String adminId);
	boolean deleteAdmin(String adminId);
	
	public Question createQuestion(Question question);
    public List<Question> getAllQuestion();
    public void deleteQuestion(int Sno);
    public Question getQuestionBySno(int Sno);
    public Question updateQuestion(Question question);

}
