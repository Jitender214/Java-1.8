package com.test;

interface Interf{
	public void m1();
}

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i = ()->System.out.println("m1 method implementation with lambda expression");
		i.m1();
	}

}
