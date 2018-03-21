package com.dgit.ex3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		
		MyInfo my = ctx.getBean(MyInfo.class);
		my.getInfo();
		ctx.close();
	}

}
