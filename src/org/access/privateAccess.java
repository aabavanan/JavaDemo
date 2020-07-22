package org.access;

public class privateAccess {
	
	public String fname = "Abdul";
	private String address = "chennai";
	
	public static void main(String[] args) {
		
		privateAccess obj = new privateAccess();
		
		System.out.println("Private First name :" +obj.fname);
		System.out.println("Private Address :" +obj.address);
	}

}
