package com.dgit.ex7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//spring에서만 제공

import com.dgit.ex4.Report;
import com.dgit.ex4.StudentInfo;
import com.dgit.ex6.Family;
@Configuration
public class ApplicationConfig {
	//xml에서 하는 기능을 java로 구현
	@Bean
	public Family family1(){
		Family family = new Family("이쁘니 아빠", "이쁘니 엄마");
		family.setSister("이쁘니 동생");
		return family;
	}
	@Bean
	public Report report1(){
		Report report = new Report();
		report.setGrade1(90);
		report.setGrade2(80);
		report.setGrade3(70);
		report.setGrade4(60);
		
		return report;
	}
	
	@Bean
	public StudentInfo student1(){
		StudentInfo s = new StudentInfo(report1(), family1());
		s.setName("이쁘니");
		s.setStdClass(1);
		s.setEng(88);
		s.setMath(87);
		s.setKor(90);
		return s;
	}
	
	@Bean
	public StudentInfo student2(){
		StudentInfo s = new StudentInfo(report1());
		s.setName("홍길동");
		s.setStdClass(4);
	
		s.setEng(88);
		s.setMath(87);
		s.setKor(90);
		return s;
	}
}
