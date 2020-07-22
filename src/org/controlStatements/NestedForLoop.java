package org.controlStatements;

public class NestedForLoop {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <= 3; j++) {
				
				System.out.println("This is second loop ->" +j);
				
			}
			
			
		}
		System.out.println("This is first for loop");
	}

}
