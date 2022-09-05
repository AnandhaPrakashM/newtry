package org.task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Month month = date.getMonth();
		String s = month.toString().toLowerCase();
		String str=s.substring(0,2).toUpperCase()+s.substring(2);
		System.out.println(str);
		
	}
}
