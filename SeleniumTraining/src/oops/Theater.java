package oops;

public abstract class Theater {
	
	// Abstraction: Showing only the functionality to the end user by hiding its internal implementation details
	
	// abstract or bodyless methods
	abstract void ticketBooking();
	abstract void SeatingCapacity();
	abstract void FireandSafety();
	abstract void parking();
	abstract void cafeteria();
	abstract void Washrooms();
	
	
	// Non abstract method or method with body or concrete method
	public void onlineBooking() {
		System.out.println("Online ticket booking facility is available..!");
	}
	
	public static void DTS() {
		System.out.println("DTS sound system is available..!");
	}
	

	public static void main(String[] args) {
		//Theater t = new Theater();
		DTS();
	}

}
