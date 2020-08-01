package com.test;

import java.util.ArrayList;

public class StreamCountMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();
		l.add("Jitendar");
		l.add("Jithu");
		l.add("Jalandhar");
		l.add("nani");
		System.out.println(l);
		long count = l.stream().filter(s->s.length()>=6).count();
		System.out.println("the no of Strings whose legnth >=9 : "+count);
	}

}
