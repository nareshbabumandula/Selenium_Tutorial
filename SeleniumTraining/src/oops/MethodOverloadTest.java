package oops;

public class MethodOverloadTest {
	
	int a=20;
	int b=30;
	
	public static int f=300;
	
	// Instance block
	{
		System.out.println("This is a instance block..!");
	}
	
	static {
		System.out.println("This is a static block..!");
	}
	
	// static method
	public static void addition(float a, float b) {
		float c = a+b;
		System.out.println("Addition of float a and b is : " + c);
	}
	
	public static void addition(float a, float b, float c) {
		float d = a+b+c;
		System.out.println("Addition of float a and b and c is : " + d);
	}
		
	public void addition(double a, double b) {
		double c =a+b;
		System.out.println("Addition of double a and b is : " + c);
	}
	
	public void addition() {
		int c = a+b;
		System.out.println("Addition of integer a and b is : " + c);
	}
	
	public void addition(int a, int b) {
		int c =a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void addition(int a, int b, int c) {
		int d =a+b+c;
		System.out.println("Addition of a, b and c is : " + d);
	}

	public MethodOverloadTest() {
		System.out.println("This is a no argument constructor..!");
	}
	
	public MethodOverloadTest(int a, int b) {
		System.out.println(a);
		System.out.println("This is a parameterized constructor with parameters : " + a + " and " +b);
	}
	

	public static void main(String[] args) {
		
		MethodOverloadTest mot = new MethodOverloadTest(100, 200);
		mot.addition();
		addition(12.4f, 20.3f); // static method call
		System.out.println(MethodOverloadTest.f);

	}

	
}
