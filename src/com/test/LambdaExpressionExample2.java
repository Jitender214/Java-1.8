package com.test;

interface Interface{
	public int getLength(String s);
}

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface i = s -> s.length();
		//Interface i = (String s) -> {return s.length();}
		// return is not required - compiler can guess automatically if it return something
		// () not required if one one parameter is there
		// {} not required if only one statement is there
		
		System.out.println(i.getLength("Hello world"));
		System.out.println(i.getLength("with lambda expression"));
	}

}
