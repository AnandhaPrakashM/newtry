
package org.task;

public class Arr {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) {
		
			System.out.println(a[i]);
		}
		
		for (int i : a) {
			
			System.out.println(i);
		}
		
		
	}

}
