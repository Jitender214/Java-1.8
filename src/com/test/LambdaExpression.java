package com.test;

@FunctionalInterface
interface inter{
	public void add(int a,int b);
	default void m2() {}
}
// @FuctionaInteface -> explicitly specify the funtional interface
// if multiple abstract methods are there in Functional interface then it will give C.E
// 


public class LambdaExpression {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter i = (a,b)->System.out.println("the sum is "+(a+b));
		i.add(3, 5);
		i.add(10, 30);
		System.out.println(System.getProperty("java.runtime.version"));
	}

}
