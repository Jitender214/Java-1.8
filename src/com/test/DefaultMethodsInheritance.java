package com.test;

interface Left {
	default void m1() {
		System.out.println("default method in Left interface");
	}
}

interface Right {
	default void m1() {
		System.out.println("default method in Rightinterface");
	}
}

public class DefaultMethodsInheritance implements Left,Right {
	//generally will get CE - Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left
	/*
	 * public void m1() { System.out.println("Own implementation method of m1"); }
	 *///if we dont want own implementation then we can do like below
	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodsInheritance t = new DefaultMethodsInheritance();
		t.m1();
	}
}
