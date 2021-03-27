package oops;

public class BOA implements FederalReserve, StateStreet, Bank{
	
	public static void main(String[] args) {
		
		BOA b = new BOA();
		b.accountTypes();
		b.KYC();
		b.Loans();
		b.MinBalance();
		b.MinWithdrawl();
		FederalReserve.CarLoan();
		System.out.println(price);
		b.Brokerage();
	}

	@Override
	public void accountTypes() {
		System.out.println("Account types are saving and current account");
		
	}

	@Override
	public void MinBalance() {
		System.out.println("MinBalance should be $500");
		
	}

	@Override
	public void MinWithdrawl() {
		System.out.println("MinWithdrawl is be $100");
		
	}

	@Override
	public void Loans() {
		System.out.println("Loan facility is availble");
		
	}

	@Override
	public void Mortgage() {
		System.out.println("Mortgage facility is availble");
		
	}

	@Override
	public void Retirement() {
		System.out.println("Retirement plans are available");
		
	}

	@Override
	public void KYC() {
		System.out.println("KYC facility is available");
		
	}

	@Override
	public void Brokerage() {
		StateStreet.super.Brokerage();
	}


}
