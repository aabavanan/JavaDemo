package org.Scanner;

import java.util.Scanner;

public class DemoScanner {

	public void add() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input:");
		int x = scan.nextInt();
		
		System.out.println("The output is  " + x);
		
		System.out.println("Enter your name:");
		String name = scan.next();
		
		System.out.println("My name is  " + name);
	}
	
	public static void main(String[] args) {
		DemoScanner demoScanner = new DemoScanner();
		demoScanner.add();
	}
}
