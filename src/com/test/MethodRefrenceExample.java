package com.test;

public class MethodRefrenceExample {
	public void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRefrenceExample mr = new MethodRefrenceExample();
		//to call instance method by Method Reference then we need to create object of that class and call
		//to call static method then we can call by classname::method name
		Runnable r = mr::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
		System.out.println("Main thread");	
		}
	}

}
