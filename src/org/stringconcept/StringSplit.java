package org.stringconcept;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String s = "@aabavanan@gmail@com";
		
		String[] split = s.split("@");
		
		System.out.println(split[1]);
		
	}

}
