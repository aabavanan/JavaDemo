package org.constructor;

public class iciciLocal {
	

	public iciciLocal() {
		
		
		System.out.println("Default constructor");
		
	}
	
	public iciciLocal(int id) {
		
		System.out.println("Argument constructor ->" +id);
		
	}
	
	public iciciLocal(String name) {
		
		System.out.println("Argument constructor ->" +name);
		
	}
	
	public static void main(String[] args) {
		//It display Default constructor value
		iciciLocal iciciLocal = new iciciLocal();
		
	}

}
