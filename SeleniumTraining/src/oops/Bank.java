package oops;

public interface Bank {
	
	public default void Brokerage() {
		System.out.println("This is a default method from StateStreet Interface..!");
	}

}
