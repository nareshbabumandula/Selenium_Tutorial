package oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		
		PVR p = new PVR();
		p.parking();
		p.ticketBooking();
		p.cafeteria();
		p.FireandSafety();
		p.onlineBooking();
		p.Washrooms();
		DTS();

	}

	@Override
	void ticketBooking() {
		System.out.println("Ticket booking facility is available");
		
	}

	@Override
	void SeatingCapacity() {
		System.out.println("SeatingCapacity is available for 500 seats");
		
	}

	@Override
	void FireandSafety() {
		System.out.println("FireandSafety precautions are taken care");
		
	}

	@Override
	void parking() {
		System.out.println("Parking facility is available to park 300 bikes and 200 cars");
		
	}

	@Override
	void cafeteria() {
		System.out.println("Cafeteria facility is availble");
		
	}

	@Override
	void Washrooms() {
		System.out.println("Washrooms are available");
		
	}

}
