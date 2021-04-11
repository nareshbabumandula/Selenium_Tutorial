package com.access.modifers;

public class ProtectedOutsideClass {

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		pt.Login();

	}

}
