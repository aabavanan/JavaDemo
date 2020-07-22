package org.outsideAccess;

import org.access.myPublic;

public class packageeOutside {
	
	public static void main(String[] args) {
		
		myPublic obj = new myPublic();
		
		String fname = obj.fname;
		
		System.out.println("First name from my Pulic Package:" +fname);
	}
	

}
