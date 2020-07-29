package com.test;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Jithu","",null,"Jitendar",null,"","Chinna"};
		Predicate<String> p = s->s!=null && s.length()!=0;
		for(String s:names) {
			if(p.test(s))
				System.out.println(s);
		}

	}

}
