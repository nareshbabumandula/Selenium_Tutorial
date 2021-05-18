package com.control.statements;

public class ForEachLoop {
	
	public void forEachExample() {
		
		String[] names = {"Navneet","Naresh","Ravi","Sean","Jodi","Kiran"};
		
		for (String person : names) {
			System.out.println(person + " : No of characters are : " + person.length());
		}
		
	}

	public static void main(String[] args) {
		ForEachLoop fe = new ForEachLoop();
		fe.forEachExample();
	}

}
