package com.access.modifers;

public class PublicOutsideClass {

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		pt.Login();

	}

}
