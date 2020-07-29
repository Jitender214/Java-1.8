package com.test;

import java.util.function.BiFunction;

class Employee3 {
	int eno;
	String ename;
	double dailywage;
	public Employee3(int eno, String ename, int dailywage) {
		this.eno = eno;
		this.ename = ename;
		this.dailywage = dailywage;
	}
}
class TimeSheet{
	int eno;
	int days;
	public TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}
public class BiFunctionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Employee3,TimeSheet,Double> f = (e,t)->e.dailywage*t.days;
		Employee3 e = new Employee3 (101, "Jithu",1500);
		TimeSheet t = new TimeSheet(101, 30);
		System.out.println("Employee Salary is "+f.apply(e, t));
		

	}

}
