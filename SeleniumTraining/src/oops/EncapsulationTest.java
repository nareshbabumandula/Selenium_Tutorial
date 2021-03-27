package oops;

public class EncapsulationTest extends EncapsulationDemo{

	public static void main(String[] args) {
		EncapsulationTest et = new EncapsulationTest();
		et.setA(100);
		System.out.println(et.getA());
		et.setUSERNAME("Naresh");
		System.out.println(et.getUSERNAME());

	}

}
