package com.test;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> f = (a,b)->a*b;
		System.out.println(f.apply(10, 20));
		System.out.println(f.apply(13, 20));
	}

}
