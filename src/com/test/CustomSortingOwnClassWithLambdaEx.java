package com.test;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eno;
	String ename;
	Employee(int eno,String ename){
		this.eno=eno;
		this.ename=ename;
	}
	public String toString() {
		return eno+":"+ename;
	}
}

public class CustomSortingOwnClassWithLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(200,"Jithu"));
		l.add(new Employee(300,"Chinna"));
		l.add(new Employee(100,"Ajay"));
		l.add(new Employee(400,"Nani"));
		System.out.println("Before Sorting "+l);
		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println("After Customizing Employee based on eno "+l);
		}

}
