package com.typecasting;

public class UpcastingTest {
	int y=200;

	public static void main(String[] args) {
		
		Parent obj1 = (Parent)new Child();
		Parent obj2 = (Parent)new Child();
		obj1.Walk();
		obj2.Walk();
		System.out.println(obj1.x);
		obj1.Run();
			
			
	}

}
