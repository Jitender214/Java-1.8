package com.test;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> p = (a,b)->(a+b)%2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(15, 20));

	}

}
