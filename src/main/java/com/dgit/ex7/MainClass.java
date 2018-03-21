package com.dgit.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dgit.ex4.StudentInfo;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		StudentInfo s1 = ctx.getBean("student1",StudentInfo.class);//java에 있는 클래스 이름으로 구별
		s1.getInfo();
		
		StudentInfo s2 = ctx.getBean("student2",StudentInfo.class);
		s2.getInfo();
		ctx.close();
	}

}
