package com.cg.oct12.batch3.day3;

public class EncapsulationDemo {
	public static void main(String[] args) {

		Employe emp = new Employe();
		System.out.println(emp.getSalary());
//		emp.salary = 10000;
		emp.setSalary(10000);
		System.out.println(emp.getSalary());
	}
	
	
}
