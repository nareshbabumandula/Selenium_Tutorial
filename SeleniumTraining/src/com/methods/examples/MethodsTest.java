package com.methods.examples;

public class MethodsTest {

	// Instance variables
	int a=10;
	int b=20;

	// Method without arguments and without return value
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	// Method with arguments and without return value
	public void subtraction(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}

	// Method without arguments and with return value
	public int multiplication() {
		int c=a*b;
		return c;
	}
	
	// Method with arguments and with return value
	public int division(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public int modulus(int a, int b) {
		int c=a%b;
		return c;
	}
	// Method with integer array as a return type
	public int[] marks() {
		int[] results = {50,60,75,80,90};
		return results;
	}

	public static void main(String[] args) {
		MethodsTest mt = new MethodsTest();
		mt.addition();
		mt.subtraction(20, 15);
		int output = mt.multiplication();
		System.out.println("Multiplication of a and b is : " + output);
		int res = mt.division(20, 10);
		int op= mt.modulus(20,10);
		System.out.println("Modulus of a and b is : " + op);
		System.out.println("Division of a and b is : " + res);
		int arrres[] = mt.marks();
		System.out.println(arrres[0]);
		System.out.println(arrres[1]);
		System.out.println(arrres[2]);
		System.out.println("No of elements in results array are : " + arrres.length);
		

	}

}
