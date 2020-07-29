package com.test;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> c = (s1,s2)->System.out.println(s1+s2);
		c.accept("Jitendar", "Bandari");

	}

}
