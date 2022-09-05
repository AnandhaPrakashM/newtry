package org.practice;

import java.util.LinkedHashMap;



// Earn*tokens&by@#viewing%Brave%^&Private#Ads@!and+)support
// Earn tokens by viewing Brave Private Ads and support
public class Occ {
public static void main(String[] args) {
	
	String s= "hi this is Sam";
	
	String[] s1 = s.split(" ");
	
	LinkedHashMap<String,Integer> m= new LinkedHashMap<>();
	
	for (int i = 0; i < s1.length; i++) {
		
		 String c= s1[i];
		
		if (m.containsKey(c)) {
			
			Integer integer = m.get(c);
			
			m.put(c, integer+1);
			
			
		} else {
			m.put(c, 1);
		}
	}
	
	
	
	System.out.println(m);
}
}
