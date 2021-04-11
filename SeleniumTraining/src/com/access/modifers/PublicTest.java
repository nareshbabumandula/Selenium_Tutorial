package com.access.modifers;

public class PublicTest {
	
	public String USERNAME = "navneet";
	
	
	public void Login() {
		System.out.println("Successfully logged into the application");
	}
	
	public PublicTest() {
		System.out.println("This is a public constructor..!");
	}

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		pt.Login();
	}

}
