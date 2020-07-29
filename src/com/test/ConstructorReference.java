package com.test;

class Sample{
	Sample(){
		System.out.println("Sample no-arg constructor");
	}
}
interface Interface1{
	public Sample get();
}

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i = Sample::new;
		Sample s = i.get();
		
	}

}
