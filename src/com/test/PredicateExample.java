package com.test;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		String[] names = {"Jithu","Kiran","Chinna","Jitendar"};
		Predicate<String> startWithJ = s->s.charAt(0)=='J';
		for(String s:names) {
			if(startWithJ.test(s)) 
				System.out.println(s);
			
		}
	}
}
