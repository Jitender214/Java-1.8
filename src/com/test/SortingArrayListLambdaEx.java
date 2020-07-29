package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayListLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(15);
		System.out.println("Before Sorting "+l);
		Collections.sort(l);
		System.out.println("After Natural Sorting Order "+l);
		Collections.sort(l, (I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);
		//compare(Integer I1,Integer I2), I1,I2 are the objects
		System.out.println("After Custom Sorting Order with Lambda Expression "+l);
	}

}
