package com.access.modifiers.outsde.pkg;

import com.access.modifers.PublicTest;

public class PublicOutsidePkg {
	
	
	public static void main(String args[]) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		pt.Login();
	}

}
