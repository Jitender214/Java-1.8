package com.test;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student2 {
	String name;
	int rollno;
	Student2(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
}

public class BiFunctionalExample2 {
	public static void main(String[] args) {
	
	ArrayList<Student2> l = new ArrayList<Student2>();
	BiFunction<String,Integer,Student2> b = (name,rollno)->new Student2(name,rollno);
	l.add(b.apply("Jithu", 100));
	l.add(b.apply("Chinna", 214));
	for(Student2 s : l) {
		System.out.println("name is "+s.name);
		System.out.println("roll no is "+s.rollno);
	}
	}
}
