package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(0);al.add(10);al.add(5);al.add(15);al.add(20);al.add(25);
	System.out.println(al);
	
	List<Integer> l1 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println("Even numbers are "+l1);
	//we are just filtering the collection

	List<Integer> l2 = al.stream().map(i->i*2).collect(Collectors.toList());
	System.out.println("equalent numbers are "+l2);
	//for every object in collection we are creating equalent object
	}

}
