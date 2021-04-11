package com.control.statements;

public class IfTest {
	
	public void ifExample(int a, int b) {
		if(a>b) {
			System.out.println("a is greater than b");
		}else if(a==b) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is less than b");
		}
		
	}

	public static void main(String[] args) {
	
		IfTest it = new IfTest();
		it.ifExample(3, 10);

	}

}
