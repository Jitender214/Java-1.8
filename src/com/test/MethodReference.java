package com.test;

interface InterfaceMethod {
	public void m1();
}

public class MethodReference {
	public static void m2() {
		System.out.println("Method reference");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMethod i = MethodReference::m2;
		i.m1();
		//when we call i.m1() --> it will call interface m1 method and this will refer to m2 method internally
	}

}
