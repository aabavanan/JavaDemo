package org.Interface;

public class iciciBank implements BankAcc {

	@Override
	public void savingsAcc() {
		System.out.println("This is ICICI Savings Accounts");
	}

	@Override
	public void fixedAcc() {
		System.out.println("This is ICICI Fixed Accounts");
	}

	@Override
	public void currentAcc() {
		System.out.println("This is ICICI Current Accounts");
	}
	
	public static void main(String[] args) {
		
		iciciBank obj = new iciciBank();
		obj.savingsAcc();
		obj.currentAcc();
		obj.fixedAcc();
		
	}

}
