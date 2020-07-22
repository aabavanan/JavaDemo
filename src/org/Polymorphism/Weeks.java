package org.Polymorphism;

public class Weeks extends Days{
	
	public void monDay() {
		
		System.out.println("Monday is worstday");
	}
	
	public void friDay() {
		System.out.println("Wow Friday");
	}
	
	public void sunDay()
	{
		System.out.println("Super Sunday");
	}
	
	public static void main(String[] args) {
		
		Weeks weeks = new Weeks();
		
		weeks.monDay();
	}
}
