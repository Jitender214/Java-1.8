package com.test;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = ()->{
			String[] str = {"Jithu","Chinna","Nani","Suchi"};
			int x = (int) (Math.random()*4);
			return str[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
