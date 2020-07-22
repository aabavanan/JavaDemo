package org.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MapClass {

	public void Hashmap() {
		
		HashMap<Integer,String> a = new HashMap<>();
		
		a.put(4, "kumar");
		a.put(1, "aaba");
		a.put(5, "babu");
		a.put(2, "zarun");
		a.put(3, "tamil");
		
		System.out.println("This is Hash Map output");
		System.out.println(a);
		
	}
	
public void Treemap() {
		
		TreeMap<Integer,String> a = new TreeMap<>();
		
		a.put(3, "kumar");
		a.put(5, "aaba");
		a.put(1, "zarun");
		a.put(3, "zarun");
		a.put(4, "tamil");
		
		System.out.println("This is Tree Map output");
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		
		MapClass obj = new MapClass();
		
		obj.Hashmap();
		
		obj.Treemap();
		
	}
	
}
