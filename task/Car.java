package org.task;

public class Car {
	
	public Car() {
	
		System.out.println("Car body");
	}

	public Car(int speed) {
		this();
		System.out.println("Car top speed is "+speed);
	}
	
	public Car(float weight) {
		this(230);
		System.out.println("Weight of car body "+weight);
	}
	
	public Car(String status) {
		this(530.7f);
		System.out.println("car status - "+ status);
	}
	
	
	public static void main(String[] args) {
		
		Car c=new Car("finished");
		
	}
	
}
