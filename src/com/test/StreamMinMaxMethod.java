package com.test;

import java.util.ArrayList;

public class StreamMinMaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
		System.out.println(l);
		Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("minimum valus is "+min);
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum value is "+max);
	}

}
