package com.test;

import java.util.ArrayList;

public class StreamtoArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
		System.out.println(l);
		Integer[] array = l.stream().toArray(Integer[] :: new);
		for(Integer j : array){
		System.out.println(j);
		}
	}

}
