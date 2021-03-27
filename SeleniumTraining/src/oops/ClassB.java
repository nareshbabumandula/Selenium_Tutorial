package oops;

public class ClassB extends ClassA{
	
	public void userRegistration() {
		System.out.println("User Regitration successful..!");
	}

	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		System.out.println(b.URL);
		System.out.println(b.USERNAME);
		System.out.println(b.PASSWORD);
		b.accessSite();
		b.login();
		b.logout();
		
	}

}
