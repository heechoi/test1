package com.dgit.ex4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass4 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx 
					= new GenericXmlApplicationContext("classpath:applicationCtx4.xml");
		
		StudentInfo std = ctx.getBean("student",StudentInfo.class);
		std.getInfo();
		ctx.close();
	}
}
