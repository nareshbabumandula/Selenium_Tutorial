package com.control.statements;

public class ForLoopTest {
	
	public void forLoopExample(int length) {
		for (int i = 0; i <= length; i++) {
			System.out.println("Iteration is : "  + i);
			if(i==3) break;
		}
	}
	
	public void evenOddNumbers(int length) {
		for (int i = 0; i <= length; i++) {
			if(i%2==0) {
				System.out.println(i + " : is an even number");
			}else {
				System.out.println(i + " : is an odd number");
			}
		}
	}
	
	public void primeNumbersTest(int length) {
		
		int i=0;
		int num=0;
		
		String primeNumbers = "";
		
		for (i = 1; i <= length; i++) {
			int counter=0;
			for (num=i;num>=1;num--) {
				if(i%num==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to " + length  +  " are : " + primeNumbers);
		
	}
	
	public void forLoopReverse(int i) {
		int num=0;
		for (num=i; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public void forInfiniteLoop() {
		for (int i = 0; i < 10; i--) {
			System.out.println("Iteration is : " + --i);
		}
	}


	public static void main(String[] args) {
		ForLoopTest flt = new ForLoopTest();
		flt.forLoopExample(20);
		flt.evenOddNumbers(10);
		flt.primeNumbersTest(5);
		flt.forLoopReverse(10);
		//flt.forInfiniteLoop();
	}

}
