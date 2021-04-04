package com.basics;

public class VariablesTest {

	// Instance variables : Variables declared inside a class and out methods are called as Instance variables
	int a=10;
	int b=20;
	
	// Static/Class Variables: Variables declared with a static keyword. Static vaaribles doesn't belong to object instead they belong to a class
	static int d=30;

	public void addition() {
		// Local Variables : Variables declared inside a method are called as local variables
		//static int e=100; // static variables cannot be local
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
		System.out.println(d); // accessing a static variable inside a non static method
	}

	public static void main(String[] args) {
		VariablesTest vt = new VariablesTest();
		VariablesTest vt1 = new VariablesTest();
		vt.addition();
		System.out.println(vt.a);
		System.out.println(vt.b);
		System.out.println("Value of static variable d is  : " + d);
		System.out.println(vt.d);
		System.out.println(vt1.d);
	}

}
