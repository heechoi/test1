package com.dgit.ex6;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dgit.ex4.StudentInfo;

public class MainClass6 {

	public static void main(String[] args) {
		String c1 = "classpath:applicationCtx4.xml";
		String c2 = "classpath:applicationCtx6.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(c1,c2);
		StudentInfo s2 = ctx.getBean("student2",StudentInfo.class);
		s2.getInfo();
		StudentInfo s = ctx.getBean("student",StudentInfo.class);
		s.getInfo();
		ctx.close();
	}

}
