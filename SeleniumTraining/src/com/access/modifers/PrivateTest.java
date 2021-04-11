package com.access.modifers;

public class PrivateTest {
	
	private String USERNAME = "navneet";
	
	
	private void Login() {
		System.out.println("Successfully logged into the application");
	}
	
	private PrivateTest() {
		System.out.println("This is a public constructor..!");
	}

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.USERNAME);
		pt.Login();
	}

}
