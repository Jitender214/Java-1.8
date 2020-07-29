package com.test;

import java.util.function.Supplier;

public class SupplierExamplePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Supplier<String> s = ()->{
		Supplier<Integer> d = ()->(int)(Math.random()*10);
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#&";
		
		Supplier<Character> s1 = ()->alphabets.charAt((int) (Math.random()*30));
		
		String pwd = "";
		for(int i=1;i<=8;i++) {
			if(i%2==0)
			pwd = pwd+d.get();
			else 
			pwd = pwd+s1.get();
			
		}
		return pwd;
		};
		System.out.println(s.get());
	}
}
