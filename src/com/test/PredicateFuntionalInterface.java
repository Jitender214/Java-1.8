package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.*;

public class PredicateFuntionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = I->I>10;
		//I->I>10 is lambda expression
		//test we are using to check the number
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		
		Predicate<String> p1 = (String s)->s.length()>5;
		System.out.println(p1.test("Temp"));
		System.out.println(p1.test("Jitendar"));
		System.out.println(p1.test("Hello"));
		
		Predicate<Collection> p2 = c->c.isEmpty();
		ArrayList al1 = new ArrayList();
		al1.add("hello");
		System.out.println(p2.test(al1));
		ArrayList al2 = new ArrayList();
		System.out.println(p2.test(al2));
	}

}
