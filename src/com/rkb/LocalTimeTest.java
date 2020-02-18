package com.rkb;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		
		LocalTime localTime1 = LocalTime.now();
		System.out.println(localTime1);
		
		LocalTime localTime2 = LocalTime.parse("09:03");
		System.out.println(localTime2);

		LocalTime localTime3 = LocalTime.of(5, 4);
		System.out.println(localTime3);
		
		LocalTime localTime4 = localTime3.plusHours(3);
		System.out.println(localTime4);

		LocalTime localTime5 = localTime3.minusMinutes(40);
		System.out.println(localTime5);
		
		boolean before = LocalTime.parse("09:03").isBefore(LocalTime.parse("09:00"));
		
		boolean after = LocalTime.parse("09:03").isAfter(LocalTime.parse("09:00"));
	}

}
