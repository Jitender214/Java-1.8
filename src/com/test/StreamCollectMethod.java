package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();
		l.add("Jitendar");
		l.add("Jithu");
		l.add("Jalandhar");
		l.add("nani");
		System.out.println(l);
		List<String> l1 = l.stream().filter(s->s.length()>=6).collect(Collectors.toList());
		System.out.println("length of string is more than 6 letters "+l1);
		List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);

	}

}
