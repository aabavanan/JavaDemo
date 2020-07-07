package org.Interface;

public class hdfcBank implements BankAcc{

	@Override
	public void savingsAcc() {
		System.out.println("This is HDFC Savings Accounts");
		
	}

	@Override
	public void fixedAcc() {
		System.out.println("This is HDFC Fixed Accounts");
		
	}

	@Override
	public void currentAcc() {
		System.out.println("This is HDFC current Accounts");
		
	}
	
	public static void main(String[] args) {
		hdfcBank obj = new hdfcBank();
		obj.savingsAcc();
		obj.fixedAcc();
		obj.currentAcc();
	}
}
