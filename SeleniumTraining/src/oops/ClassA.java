package oops;

public class ClassA {
	
	// State or characteristics
	String URL ="https://www.blazedemo.com";
	String USERNAME = "navneet";
	String PASSWORD = "Secure*123";
	
	// User defined method or also called as behavior or functionality or just a method
	public void accessSite() {
		System.out.println("Accessed the site : " + URL);
	}
	
	// Behavior or Action
	public void login() {
		System.out.println("Successfully logged into the application with the USERID : " + USERNAME);
	}
	
	public void logout() {
		System.out.println("Successfully logged out from Blazedemo application");
	}
	
	// No argument explicit constructor
	ClassA(){
		System.out.println("This is a no argument explicit constructor");
	}

	public static void main(String[] args) {
		
		// Create an object reference for a class
		//ClassName objRef = new Constructor();
		
		ClassA a = new ClassA();
		System.out.println(a.URL);
		System.out.println(a.USERNAME);
		System.out.println(a.PASSWORD);
		a.accessSite();
		a.login();
		a.logout();
		
	}

}
