package com.access.modifiers.outsde.pkg;

import com.access.modifers.ProtectedTest;

public class ProtectedOutsidePkg extends ProtectedTest{

	public static void main(String[] args) {
		//ProtectedTest pt = new ProtectedTest();
		//System.out.println(pt.USERNAME);
		//pt.Login();
		
		ProtectedOutsidePkg pop = new ProtectedOutsidePkg();
		System.out.println(pop.USERNAME);
		pop.Login();

	}

}
