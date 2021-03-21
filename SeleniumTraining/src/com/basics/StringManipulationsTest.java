package com.basics;

public class StringManipulationsTest {

	public static void main(String[] args) {


		String asText1 =  "hello";
		String asText2 =  "WORLD";
		String asText3 =  "welcome to core java online training";
		String asText4 =  "                        hello world                          ";
		
		System.out.println("Length of the string is : " + asText1.length());
		System.out.println(asText2.toLowerCase());
		System.out.println(asText3.toUpperCase());
		System.out.println(asText4.trim());
		System.out.println(asText1.charAt(0));
		System.out.println(asText2.indexOf('O'));
		System.out.println(asText3.equals("welcome to core java online training"));
		System.out.println(asText3.contains("java"));
	}

}
