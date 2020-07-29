package com.test;

@FunctionalInterface
interface parent{
	public void m1();
}
@FunctionalInterface
interface child extends parent
{

}

/*
 * @FunctionalInterface interface child1 extends parent{ public void m2(); }
 */
interface child2 extends parent{
	public void m2();
}
// child interface doesnot contain any methods so its valid and child inteface is always FI
// in the child interface we can define same exactly parent abstract method then its valid.
// in the child interface we can't define any new child abstract methods - its give C.E
// if not mention child interface as FI inteface then child interface is normal interface and its valid

public class LambdaExInheritance {
	public static void main(String[] args) {
		
	}
}
