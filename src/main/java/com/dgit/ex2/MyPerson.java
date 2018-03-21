package com.dgit.ex2;

public class MyPerson {
	private String name;
	private int age;
	private int pay;
	private TaxCalculator taxCalculator;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public TaxCalculator getTaxCalculator() {
		return taxCalculator;
	}
	public void setTaxCalculator(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}
	
	public void printInfo(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("월급 : "+pay);
		this.getTaxCalculator().taxCalculator(pay);
	}
}
