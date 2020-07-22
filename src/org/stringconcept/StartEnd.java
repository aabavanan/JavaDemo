package org.stringconcept;

public class StartEnd {
	
	public static void main(String[] args) {
		
		String s = "aabavanan@gmail.com";
		
		boolean startsWith = s.startsWith("Aaba");
		
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("Com");
		
		System.out.println(endsWith);
		
	}

}
