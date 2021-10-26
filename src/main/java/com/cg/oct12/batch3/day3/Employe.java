package com.cg.oct12.batch3.day3;

public class Employe {
	private int eid;
	private String firstName;
	private double salary = 8000; // read-only + writable field
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

	


}
