package org.controlStatements;

import java.util.Scanner;

public class Operators {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number one - >");
		int a = scan.nextInt();
		
		System.out.println("Enter the number two - >");
		int b = scan.nextInt();
		
		if (a != 5 || b != 10) {
			
			System.out.println("The number one and two is matched ");
			
		}
		else {
			System.out.println("Not matched");
		}
		
	}

}
