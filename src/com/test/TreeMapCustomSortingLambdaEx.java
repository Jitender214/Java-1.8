package com.test;

import java.util.TreeMap;

public class TreeMapCustomSortingLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> m = new TreeMap<Integer,String>();
		m.put(1, "Jithu");
		m.put(2, "Nani");
		m.put(3, "Chinna");
		System.out.println("Natural Soring Order "+m);
		TreeMap<Integer,String> m1 = new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);
		m1.putAll(m);
		System.out.println("After Customised Sorting Order with Lambda Expression "+m1);
		
	}

}
