package com.test;

import java.util.ArrayList;
import java.util.function.Function;

class Student1 {
	String name;
	int marks;
	
	Student1(String name,int marks){
		this.name=name;
		this.marks=marks;
	}	
}
public class FuctionPredefinedInterface {
	public static void main(String[] args) {
	ArrayList<Student1> l = new ArrayList<Student1>(); 
	populate(l);
	Function<Student1,String> f = s->{
		int marks = s.marks;
		if(marks>=75) {
			return "A[Dictincation]";
		}
		if(marks>=60) {
			return "FirstClass";
		}
		if(marks>=35) {
			return "Pass";
		}
		else {
			return "Failed";
		}		
	};
	for(Student1 s:l) {
		System.out.println("Student name "+s.name);
		System.out.println("Student marks" +s.marks);
		System.out.println("Student Result "+f.apply(s));	
	}
	}
	public static void populate(ArrayList<Student1> l) {
		
	l.add(new Student1("Jithu",80));
	l.add(new Student1("Chinna",60));
	l.add(new Student1("Ajay",40));
	l.add(new Student1("Kiran",25));
	}
}


