package com.dgit.ex;

public class Calculator {

	public void add(int num1,int num2){
		System.out.println("--------------add-------------");
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
	}
	
	public void sub(int num1,int num2){
		System.out.println("--------------sub-------------");
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		
	}
	
	public void mul(int num1,int num2){
		System.out.println("--------------mul-------------");
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		
	}
	

	public void div(int num1,int num2){
		System.out.println("--------------div-------------");
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
	}
}
