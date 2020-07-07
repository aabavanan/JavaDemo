package org.Abstract;

public class iciciLocal extends iciciMain{
	
	public void savingsAcc() {
		System.out.println("This is savings Account");
	}
	
	public void fixedAcc() {
		System.out.println("This is fixed Account");
	}
	
	public static void main(String[] args) {
		
		iciciLocal obj = new iciciLocal();
		obj.loanAcc();
		obj.savingsAcc();
		obj.fixedAcc();
	}

}
