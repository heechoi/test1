package com.dgit.ex5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx5.xml");
		Pencil p = ctx.getBean(Pencil.class);
		p.use();
		ctx.close();
	}
}
