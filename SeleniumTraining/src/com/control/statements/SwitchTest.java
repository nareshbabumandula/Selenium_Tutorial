package com.control.statements;

public class SwitchTest {
	
	public void verifyDay(String strDay) {
		switch (strDay.toLowerCase().trim()) {
		case "sun": {
			System.out.println("Sunday");
			break;
		}
		case "mon": {
			System.out.println("Monday");
			break;
		}
		case "tue": {
			System.out.println("Tuesday");
			break;
		}
		case "wed": {
			System.out.println("Wednesday");
			break;
		}
		case "thu": {
			System.out.println("Thursday");
			break;
		}

		case "fri": {
			System.out.println("Friday");
			break;
		}
		
		default:
			System.out.println("Invalid Day..!");
		}
	}

	public static void main(String[] args) {
		
		SwitchTest st = new SwitchTest();
		st.verifyDay("    MON  ");
	}

}
