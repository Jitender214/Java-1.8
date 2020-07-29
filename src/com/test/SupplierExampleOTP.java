package com.test;

import java.util.function.Supplier;

public class SupplierExampleOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = ()->{
			String otp = "";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10); //(0<=x<1)*10  --minimum is zero and max is 0.999*10=9.99
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
