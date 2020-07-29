package com.test;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class IntPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0,5,10,15,20,25,30}; 
		//if we are using IntPredicate then no need of automatic conversion from int to Integer(Auto Boxing) and Interger to int(AuotUnBoxing)
		//so performance will imporove
		//Predicate<Integer> p ->i%2==0;
		IntPredicate p = i->i%2==0;
		for(int x1 : x) {
			if(p.test(x1))
			System.out.println("even numbers is "+x1);
		}
		//Integer is return type
		IntFunction<Integer> f = i->i*i;
		System.out.println("multiplecation is "+f.apply(5));
		
		ToIntFunction<String> f1 = s->s.length();
		System.out.println("String length is "+f1.applyAsInt("Jithu"));
	}

}
