package org.practice;

import java.util.ArrayList;
import java.util.List;

public class EncapList {
	
	public static void main(String[] args) {
		
		Encap a= new Encap(12,34,"hi");
		
		Encap a1=new Encap(34,54,"hiiii");
		
		
		List<Encap> l= new ArrayList<Encap>();
		
		l.add(a);
		l.add(a1);
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getA());
			System.out.println(l.get(i).getB());
			System.out.println(l.get(i).getS());
		}
	}

}
