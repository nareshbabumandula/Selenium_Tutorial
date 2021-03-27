package oops;

public interface FederalReserve {
	
	int price=1000;
	
	abstract void accountTypes();
	abstract void MinBalance();
	abstract void MinWithdrawl();
	abstract void Loans();
	abstract void Mortgage();
	abstract void Retirement();
	abstract void KYC();
	
	public default void Brokerage() {
		System.out.println("This is a default method from FederalReserve Interface..!");
	}
	
	static void CarLoan() {
		System.out.println("This is a static method..!");
	}
	

	public static void main(String[] args) {
		//FederalReserve fr = new FederalReserve();
		CarLoan();
	}
}
