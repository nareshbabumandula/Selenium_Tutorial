package com.control.statements;

public class DoWhileLoopTest {
	
	public void dowhileLoopExample() {
		int i=1;
		
		do {
			System.out.println("Iteration is  : " + i);
			i++;
		} while (i>=10);
	}

	public static void main(String[] args) {
		DoWhileLoopTest dwlt = new DoWhileLoopTest();
		dwlt.dowhileLoopExample();

	}

}
