package com.rkb;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1); // 2020-02-18
		
		Clock clock = Clock.systemDefaultZone();
		
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);//2020-02-18
		
		ZoneId zone = ZoneId.of("Europe/Paris");
		LocalDate localDate3 = LocalDate.now(zone);
		System.out.println(localDate3);//2020-02-18
		
		System.out.println("-----------------------------");
		LocalDate localDate4 = LocalDate.of(2020, 02, 18);
		System.out.println(localDate4);// 2020-02-18
		
		LocalDate localDate5 = LocalDate.parse("2020-02-18");
		System.out.println(localDate5);// 2020-02-18
		
		LocalDate localDate6 = localDate5.plusDays(5);// we can add days, week, month, year
		System.out.println(localDate6);
		
		LocalDate localDate7 = localDate5.minusDays(5); // we can subtract days, weeks, months, year
		System.out.println(localDate7);
		
		System.out.println("-----------------------------");
		
		int dayOfMounth = LocalDate.parse("2020-01-18").getDayOfMonth(); // we can get day of month, day of week, year
		System.out.println(dayOfMounth);//18
		
	DayOfWeek dayOfWeek =	LocalDate.parse("2020-01-18").getDayOfWeek();
	System.out.println(dayOfWeek);//SATURDAY
	
	System.out.println("-----------------------------");
	boolean before = LocalDate.parse("2020-01-18").isBefore(LocalDate.parse("2020-02-18"));
	
	boolean after = LocalDate.parse("2020-01-18").isAfter(LocalDate.parse("2020-02-18"));

	}

}
