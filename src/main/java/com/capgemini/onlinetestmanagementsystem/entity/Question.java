package com.capgemini.onlinetestmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question5")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="serialNo")
	private int serialNo;
	
	@Column(name="questionValue")
	private String questionValue;
	
	@Column(name="questionDomain")
	private String questionDomain;
	
	@Column(name="correctOption")
	private String correctOption; 
	
	@Column(name="Option1")
	private String Option1;
	
	@Column(name="Option2")
	private String Option2;
	
	@Column(name="Option3")
	private String Option3;
	
	@Column(name="Option4")
	private String Option4;

	@Column(name="questionMarks")
	private int questionMarks;
	
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getQuestionValue() {
		return questionValue;
	}

	public void setQuestionValue(String questionValue) {
		this.questionValue = questionValue;
	}

	public String getQuestionDomain() {
		return questionDomain;
	}

	public void setQuestionDomain(String questionDomain) {
		this.questionDomain = questionDomain;
	}

	public String getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}

	public int getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}

	public Question()
	{
		
	}
	
	public Question(int serialNo, String questionValue, String questionDomain, String Option1,String Option2,
			String Option3,String Option4,String correctOption,int questionMarks)
	{
		this.serialNo=serialNo;
		this.questionValue=questionValue;
		this.questionDomain=questionDomain;
		this.correctOption=correctOption;
		this.questionMarks=questionMarks;
		this.Option1=Option1;
		this.Option2=Option2;
		this.Option3=Option3;
		this.Option4=Option4;
	}
	
	@Override
	public String toString()
	{
		return "Question[serialNo="+serialNo+",questionValue"+questionValue+",questionMarks"+questionMarks+
				",questionDomain"+questionDomain+",correctOption"+correctOption+",Option1"+Option1+",Option2"+
				Option2+",Option3"+Option3+",Option4"+Option4+"]";
				
	}

}
