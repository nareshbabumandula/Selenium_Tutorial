package com.access.modifers;

public class DefaultTest {
	
	String USERNAME = "navneet";
		
	void Login() {
		System.out.println("Successfully logged into the application");
	}
	
	DefaultTest() {
		System.out.println("This is a default constructor..!");
	}

	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.USERNAME);
		pt.Login();
	}

}
