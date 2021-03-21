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
		System.out.println(asText3.equals("welcome to core java online Training"));
		System.out.println(asText3.contains("java"));
		System.out.println(asText3.startsWith("welcome"));
		System.out.println(asText3.endsWith("training"));
		System.out.println(asText1.equalsIgnoreCase("HELLO"));
		System.out.println(asText3.replaceAll("core java", "J2SE"));
		System.out.println(asText3.isEmpty());
		System.out.println(asText1.concat(" ").concat(asText2));
		System.out.println(asText1.isBlank());
		System.out.println(asText3.lastIndexOf('e'));
		String arrText[] = {"John","Sandhya","Naresh","Ravi","Teja","Kiran","Hari"};
		
		System.out.println(arrText.length);
		System.out.println(arrText[0]);
		System.out.println(arrText[1]);
		System.out.println(arrText[2]);
		
		for (String name : arrText) {
			System.out.println("Name found is  : " + name);
		}

		
	}

}
