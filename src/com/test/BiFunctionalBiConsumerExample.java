package com.test;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Employee4 {
	String name;
	Double salary;
	public Employee4(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class BiFunctionalBiConsumerExample {
	public static void main(String[] args) {
	ArrayList<Employee4> l = new ArrayList<Employee4>();
	BiFunction<String,Double,Employee4> f = (name,salary)->new Employee4(name,salary);
	l.add(f.apply("Jithu",15000.00));
	l.add(f.apply("Chinna", 25000.00));
	
	BiConsumer<Employee4,Double> c = (e,d)->e.salary=e.salary*d;
	for(Employee4 e:l) {
		c.accept(e, 500.00);
	}
	Consumer<Employee4> c1 = e->{
		System.out.println(e.name);
		System.out.println(e.salary);
	};
	for(Employee4 e : l) {
	c1.accept(e);	
	}
	for(Employee4 e : l) {
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	}
}
