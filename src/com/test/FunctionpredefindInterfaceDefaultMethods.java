package com.test;

import java.util.function.Function;

public class FunctionpredefindInterfaceDefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> f1 = s->s.toUpperCase();
		Function<String, String> f2 = s->s.substring(0,9);
		System.out.println("Result of f1 "+f1.apply("JitendarBandari"));
		System.out.println("Result of f2 "+f2.apply("JitendarBandari"));
		System.out.println("Result of f1.andThen(f2) "+f1.andThen(f2).apply("JitendarBandari"));
		System.out.println("Result of f2.compose(f1) "+f2.compose(f1).apply("JitendarBandari"));

	}

}
