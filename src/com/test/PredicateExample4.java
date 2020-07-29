package com.test;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.test.Employee1;

public class PredicateExample4 {
		
	public static void display(ArrayList<Employee1> al) {
		
		al.add(new Employee1("Jithu","Banglore",25000,"Software Engineer"));
		al.add(new Employee1("Chinna","Hyderabad",30000.874463,"Manager"));
		al.add(new Employee1("Nani","Hyderabad",50000,"Senior Software Engineer"));
		al.add(new Employee1("Kiran","Pune",15000,"Software Engineer"));
		al.add(new Employee1("Ramakrishna","Banglore",60000,"Manager"));
		al.add(new Employee1("Subbu","Pune",45000,"Team Lead"));
		
	}
	public static void populate(Predicate<Employee1> p, ArrayList<Employee1> al) {
		for(Employee1 e:al) {
			if(p.test(e)){
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		display(al);
		System.out.println(al);
		
		Predicate<Employee1> p = emp->emp.location.equals("Banglore");
		System.out.println("Employee located at Banglore........................");
		populate(p,al);
		Predicate<Employee1> p1 = emp->emp.designation.equals("Manager");
		System.out.println("Managers information........................");
		populate(p1,al);
		Predicate<Employee1> p2 = emp->emp.salary>20000;
		System.out.println("Employees having more than 20000 Salary........................");
		populate(p2,al);
		Predicate<Employee1> p6 = emp->emp.salary>50000;
		System.out.println("Employees having more than 20000 Salary........................");
		populate(p6,al);
		Predicate<Employee1> p3 = emp->emp.designation.equals("Manager");
		System.out.println("Check Emoplyee is Manager and having salary more than 20000........................");
		populate(p1.and(p3),al);
		Predicate<Employee1> p4 = emp->emp.designation.equals("Software Engineer");
		System.out.println("Check Emoplyee is Software Engineer and having location is from Banglore......................");
		populate(p.and(p4),al);
		Predicate<Employee1> p5 = emp->emp.designation.equals("Manager");
		System.out.println("Check Emoplyee is Manager or salary more than 50000....................");
		populate(p1.or(p6),al);
		Predicate<Employee1> p7 = emp->emp.designation.equals("Manager");
		System.out.println("Check Emoplyee is not Managers....................");
		populate(p1.negate(),al);
		
		
		Predicate<Employee1> isCEO = Predicate.isEqual(new Employee1("ABC","Pune",45000,"CEO"));
		System.out.println("Check CEO with isEqual....................");
		Employee1 e1 = new Employee1("ABC","Pune",45000,"CEO");
		Employee1 e2 = new Employee1("XYZ","Pune",25000,"Manager");
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		
	}

}
