package com.rkb;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class Test {

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

	}

}
