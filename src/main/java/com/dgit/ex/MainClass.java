package com.dgit.ex;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	 public static void main(String[] args) {
		
		/*MyCalculator my = new MyCalculator();
		
		my.setCalculator(new Calculator());//DI
		
		my.setNum1(10);
		my.setNum2(5);	
		
		my.add();
		my.sub();
		my.mul();
		my.div();*/
		 
		 GenericXmlApplicationContext ctx = 
				 new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		 
		 MyCalculator cal = ctx.getBean(MyCalculator.class);
		 cal.add();
		 cal.sub();
		 cal.mul();
		 cal.div();
		 ctx.close();//반드시 닫아주어야한다.
	}
}
