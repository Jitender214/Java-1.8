package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
		System.out.println(l);
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("after default natural sorting : " +l1);
		List<Integer> l2 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		//here we are reversing the default natural sorting order.
		//compareTo() is comparable interface method
		System.out.println("descending order : "+l2);
		
	}

}
