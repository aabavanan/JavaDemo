package org.Polymorphism;

public class Employee {
	
	//overloading
	
	public void empDetails()
	{
		System.out.println("*****TCS Employee********");
	}
	
	public void empDetails(int empID) {
		
		System.out.println("Employee ID:" +empID);
		
	}
	
	public void empDetails(long sal) {
		
		System.out.println("Employee salary:" +sal);
		
	}
		public void empDetails(String ename) {
		System.out.println("Employee name:" +ename);
	}
	
	public static void main(String[] args) {
		Employee objemp = new Employee();
		
		objemp.empDetails();
		
		objemp.empDetails(1234);
		
		objemp.empDetails(10000l);
		
		objemp.empDetails("Aabavanan");
		
		
	}
}
