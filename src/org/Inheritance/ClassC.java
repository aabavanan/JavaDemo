package org.Inheritance;

public class ClassC extends ClassB {
	
	public void triangle() {
		
		System.out.println("This is Triangle class");
	}
	
	public static void main(String[] args) {
		
		ClassC classC = new ClassC();
		classC.rectangle();
		classC.square();
		classC.triangle();
	}

}
