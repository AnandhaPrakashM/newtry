package org.task;

public class EmpDetails {
	
	public EmpDetails() {
	
			}
	
	public EmpDetails(String name) {
		this();
		System.out.println("Employee name is "+name);
	}
	
	public EmpDetails(String address, String position) {
		this("shiva");
		System.out.println("Employee Address is "+address);
		System.out.println("Employee position is "+position);
		
	}
	
public static void main(String[] args) {
	
	EmpDetails e= new EmpDetails("OMR","Trainer");
	
	}
		}
