package org.access;

public class outSide {
	
	public void myOutside() {
		System.out.println("This is another Class");
	}
	
	public static void main(String[] args) {
		
		myPublic publicObj = new myPublic();
		
		String fname = publicObj.fname;
		
		System.out.println(fname);
		
	}

}
