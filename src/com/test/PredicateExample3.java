package com.test;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String passwrod;
	User(String username,String password){
		this.username=username;
		this.passwrod=password;
	}
}

public class PredicateExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<User> p = user->user.username.equals("jithu") && user.passwrod.equals("test");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username ");
		String username = sc.next();
		System.out.println("Enter password ");
		String password = sc.next();
		User u = new User(username,password);
		if(p.test(u))
		System.out.println("valid user");
		else
			System.out.println("Not valid");
	}

}
