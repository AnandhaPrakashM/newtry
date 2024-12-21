package org.practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Iterate {
	public static void main(String[] args) {
		System.out.println("MARK &&&4");

		Vector v= new Vector();
		
		v.add("hii");
		v.add("gdgdhg");
		v.add("ssja");
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object object = e.nextElement();
			System.out.println(object);
		}
		
	
		List<Integer> l= new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		Iterator<Integer> i = l.iterator();
		
		System.out.println(l);
		
		while (i.hasNext()) {
			Integer o = i.next();
			
			if (o==50) {
				i.remove();	
			}
		}
		
		System.out.println(l);
		
		ListIterator<Integer> li = l.listIterator();
		
		while (li.hasNext()) {
			Integer integer = (Integer) li.next();
			System.out.print(integer+" ");
		}
		
		System.out.println();
		while (li.hasPrevious()) {
			Integer integer = (Integer) li.previous();
			System.out.print(integer+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
