package com.test;

public class Employee1 {
	
	String ename;
	String location;
	double salary;
	String designation;
	Employee1(String ename, String location, double salary, String designation) {
		this.ename = ename;
		this.location = location;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		/*
		 * return "ename=" + ename + ", location=" + location + ", salary=" + salary +
		 * ", designation=" + designation ;
		 */
		String s = String.format("(%s,%s,%.2f,%S)",ename,location,salary,designation);
		return s;
	}
	public boolean equals(Object obj) {
		Employee1 e = (Employee1)obj;
		if(ename.equals(e.ename)&&location.equals(location)&&salary==e.salary&&designation.equals(designation)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
