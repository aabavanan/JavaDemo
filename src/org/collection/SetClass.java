package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {
	
	public void Hash() {
		
		HashSet<String> a = new HashSet<String>();
		
		a.add("kumar");
		a.add("tamil");
		a.add("babu");
		a.add("arun");
		a.add("logu");
		a.add("arun");
		a.add("zarun");
		
		System.out.println("This is Hash Set");
		System.out.println(a);
		
	}
	
	public void LinkedHash() {
		
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		
		a.add("kumar");
		a.add("tamil");
		a.add("babu");
		a.add("arun");
		a.add("logu");
		a.add("arun");
		a.add("zarun");
		
		System.out.println("This is Linked Hash Set");
		System.out.println(a);
		
	}
	
	public void TreeHash() {
		
		TreeSet<String> a = new TreeSet<String>();
		
		a.add("kumar");
		a.add("tamil");
		a.add("babu");
		a.add("arun");
		a.add("logu");
		a.add("arun");
		a.add("zarun");
		
		System.out.println("This is Tree Hash Set");
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		SetClass obj = new SetClass();
		
		obj.Hash();
		
		obj.LinkedHash();
		
		obj.TreeHash();
		
	}
	
	
	

}
