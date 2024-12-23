package org.practice;

public class Java2 extends Java1{
	
	public Java2(String b) {
		
		System.out.println("value");
		System.out.println("test gitpush 4");
	}
	
	public Java2() {
	this("java2");
		System.out.println("default of child");
	}
	@Override
	public void salary() {
		
		System.out.println("salary is 100000");
		
		
	}	
	
	public static void main(String[] args) {
		
		
		Java2 a = new Java2();
	
		a.salary();
	}

	
}
