package oops;

public class EncapsulationDemo {
	
	private int a=10;
	private int b=20;
	private String USERNAME ="Navneet";

	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		System.out.println(ed.a);
		System.out.println(ed.b);
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
