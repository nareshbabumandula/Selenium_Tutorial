package com.access.modifers;

public class ProtectedTest {
	
	protected String USERNAME = "navneet";
		
	protected void Login() {
		System.out.println("Successfully logged into the application");
	}
	
	protected ProtectedTest() {
		System.out.println("This is a protected constructor..!");
	}

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		pt.Login();
	}

}
