package org.stringconcept;

public class SearchString {
	
	public static void main(String[] args) {
		
		String s = "aabavanan";
		
		for (int i = 0; i < s.length(); i++) {
			
			char charAt = s.charAt(i);
			
			if (charAt == 'a') {
				
				System.out.println(i);
			}
			
			
		}
		
	}

}
