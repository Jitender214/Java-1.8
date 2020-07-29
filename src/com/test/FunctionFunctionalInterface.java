package com.test;

import java.util.function.Function;

public class FunctionFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("Jithu"));
		System.out.println(f.apply("Chinna"));
		
		Function<Integer,Integer> f1 = i->i*i;
		System.out.println(f1.apply(5));
		String str = "Hello Welcome To Java 1.8 Program";
		Function<String,Integer> f2 = s->str.length()-str.replaceAll(" ", "").length();
		System.out.println("To print number spaces in given string...");
		System.out.println(f2.apply(str));
		
		
	}

}
