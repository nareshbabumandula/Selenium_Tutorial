package oops;

public class ClassC extends ClassB {
	
	public void searchFlight(String Depature, String Arrival) {
		System.out.println("Successfully searched flight from : " +Depature+  " to " + Arrival);
	}

	public static void main(String[] args) {
		
		ClassC c = new ClassC();
		System.out.println(c.URL);
		System.out.println(c.USERNAME);
		System.out.println(c.PASSWORD);
		c.accessSite();
		c.userRegistration();
		c.login();
		c.searchFlight("London", "USA");
		c.logout();
		
				
		
	}

}
