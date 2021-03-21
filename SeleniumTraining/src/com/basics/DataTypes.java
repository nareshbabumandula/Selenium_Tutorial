package com.basics;

public class DataTypes {

	public static void main(String[] args) {
			
		/*
		 * Primitive Data Types byte, short, int, long, float, double, char, boolean In
		 * Java type checking happens at compile time and hence it is called a
		 * statically typed programming language In Java memory allocation for the all
		 * primitive data types happens at run-time and hence Java is called as a
		 * dynamic programming language
		 * Java is a high level programming language
		 * In Java for the primitive types there are corresponding wrapper classes available
		 * e.g. byte --> Byte , short --> Short, int --> Integer etc
		 */
		 		
		byte a=114;
		short b=1234;
		int c=11345;
		long l = 345456;
		float d = 23.4f;
		double e = 12331.23425;
		char f = 'h';
		boolean g = true;
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("Short min value is : " + Short.MIN_VALUE);
		System.out.println("Short max value is : " + Short.MAX_VALUE);
		System.out.println("Integer min value is : " + Integer.MIN_VALUE);
		System.out.println("Integer max value is : " + Integer.MAX_VALUE);
			
		// Non Primitive Data Types or user defined data types
		
		String asText = "hello world this is core java";
		System.out.println(asText);
		System.out.println(asText.length());
		System.out.println(asText.toUpperCase());
		
		// Array - Series of elements of same datatypes - homegenous
		int[] Marks = {40,70,80,60,35,90};
		System.out.println(Marks[0]);
		System.out.println(Marks[1]);
		System.out.println(Marks[2]);

		// Type casting : Converting one type of data into an another type
		byte b1 = 101;
		int a1 = b1; // Widening or upcasting - Converting smaller type to a larger type
		System.out.println(a1);
		
		int a2 = 133;
		byte b2 = (byte) a2; // Narrowing or downcasting - Converting bigger type to a smaller type
		System.out.println(b2);

		
	
	}

}
