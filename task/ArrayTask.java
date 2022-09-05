package org.task;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
			int sum=0;	
		for (int i = 0; i < a.length; i++) {
		
			sum +=a[i];
			
					}
		
		System.out.println("Sum of array="+sum);

	float  avg= sum/(a.length);
		
		System.out.println(avg);
	
	}

}
