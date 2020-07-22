package org.stringconcept;

public class equalsTo {
	
	public static void main(String[] args) {
		
		String s = "Aabavanan";
		
		String m = "aabavanan";
		
		boolean equals = s.equals(m);
		
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(m);
		
		System.out.println(equalsIgnoreCase);
		
	}

}
