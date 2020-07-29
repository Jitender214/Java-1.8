package com.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mixup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		//Set s = new HashSet();
		TreeSet ts = new TreeSet();
		//LinkedHashSet ls = new LinkedHashSet();
		//s.add("o");
		//s.add(o);
		ts.add("o");
		ts.add(o);
		//ls.add("o");
		//ls.add(o);
		//System.out.println(ls);
		//System.out.println(s);
		System.out.println(ts);
		
	}

}
