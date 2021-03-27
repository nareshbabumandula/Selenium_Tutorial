package oops;

public class MethodOverridingTest extends MethodOverloadTest{

	int a=40;

	// Instance block
	{
		System.out.println("This is a instance block of subclass..!");
	}

	static {
		System.out.println("This is a static block of subclass..!");
	}
	
	public void addition(int a, int b) {
		int c =a+b;
		System.out.println("Addition of a and b in subclass is : " + c);
	}

	public void Test() {
		super.addition(100, 200);
		this.addition(150,250);
		System.out.println(super.a);
	}


	public static void addition(float a, float b, float c) {
		float d = a+b+c;
		System.out.println("Addition of float a and b and c in subclass is : " + d);
	}



	public static void main(String[] args) {

		MethodOverridingTest mot = new MethodOverridingTest();
		mot.addition(20, 70);
		mot.Test();
		addition(10.4f, 20.5f, 30.6f);

	}

}
