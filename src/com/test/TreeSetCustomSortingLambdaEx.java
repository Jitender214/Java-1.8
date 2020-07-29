package com.test;

import java.util.TreeSet;

public class TreeSetCustomSortingLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(5);
		t.add(0);
		t.add(15);
		System.out.println("Natual Sorting Order "+t);
		TreeSet<Integer> t1 = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);
		t1.addAll(t);
		System.out.println("After Customised Sorting Order with Lambda Expression "+t1);

	}

}
