package org.practice;

public class Variable {
	
	static int a=10;
	
	private void test() {

		a++;
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Variable c= new Variable();
		
		c.test();
		
		c.test();
		
		Variable c1= new Variable();
		
		c1.test();
		
	}
	
}
