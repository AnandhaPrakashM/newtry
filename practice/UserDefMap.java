package org.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefMap {
	
public static void main(String[] args) {
		
		Encap a= new Encap(12,34,"haiii");
		
		Encap a1= new Encap(34,54,"heloo");
		
		Encap a2= new Encap(89,44,"gshs");
		
		
		Map<Encap,String> l=new LinkedHashMap<>();
			
		l.put(a,null);
		l.put(a1,null);
		l.put(a2,null);
		
		Set<Entry<Encap, String>> entrySet = l.entrySet();
		
		for (Entry<Encap, String> entry : entrySet) {
			
			Encap key = entry.getKey();
			
			System.out.println(key.getA());
			
			System.out.println(key.getB());
			
			System.out.println(key.getS());
			
		}
	}

}
