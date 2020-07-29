package com.test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		Student stu1 = new Student("ABC");
		Student stu2 = new Student("ABC");
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1==stu2);
		String name = null;
		System.out.println(name!=null);
		String s = "Since i joined in Wipro. It was nice working with in term of Team and Technologies,As i observed conduct more technical trainings related to Projects which we are using. one more is Onsite opportunities needs to improve.";
		System.out.println(s.length());
	}

}
