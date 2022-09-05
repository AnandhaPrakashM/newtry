package org.practice;


import java.util.ArrayList;
import java.util.List;

public class Collection1  {
	
	public static void main(String[] args) {
		
	
	List l= new ArrayList();
	
	
l.add("anand");
l.add('M');
l.add(1996);
l.add("Jan");
l.add("anand");

		System.out.println(l);
		
		System.out.println(	l.lastIndexOf(1996));
		l.remove(4);
		System.out.println(l);
		
		System.out.println(l.get(2));
		
		System.out.println(	l.indexOf(1996));

		System.out.println(l.contains(1996));
	
		l.set(1, "Munusamy");
		System.out.println(l);
		
		for (int i = 0; i < l.size(); i++) {
		
			System.out.println(l.get(i));

		}
		
for (Object object : l) {
	
	System.out.println(object);			
						
	}


System.out.println();
}
	
}