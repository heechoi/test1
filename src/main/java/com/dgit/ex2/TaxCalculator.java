package com.dgit.ex2;

public class TaxCalculator {
	private double lowTax;
	private double normalTax;
	private double overTax;
	public double getLowTax() {
		return lowTax;
	}
	public void setLowTax(double lowTax) {
		this.lowTax = lowTax;
	}
	public double getNormalTax() {
		return normalTax;
	}
	public void setNormalTax(double normalTax) {
		this.normalTax = normalTax;
	}
	public double getOverTax() {
		return overTax;
	}
	public void setOverTax(double overTax) {
		this.overTax = overTax;
	}
	
	
	public void taxCalculator(int pay){
		double tax = 0;
		if(pay < 150){
			tax = pay*lowTax/100;
		}else if(pay<300){
			tax =  pay*normalTax/100;
		}else{
			tax =  pay*overTax/100;
		}
		
		System.out.println("당신의 세금은"+tax+"원 입니다.");
	}
}
