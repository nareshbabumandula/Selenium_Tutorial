package com.typecasting;

public class DowncastingTest {
	int y=200;

	public static void main(String[] args) {
		// Performing downcasting implicity
		//Child c = new Parent(); // Compilation error
		
		// Performing downcasting explicitly
		Parent p = new Child();
		Child c = (Child)p;
		System.out.println(c.y);
		System.out.println(c.x);
		c.Walk();
		c.Run();
		c.Sleep();
			
	}

}
