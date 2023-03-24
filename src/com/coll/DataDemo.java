package com.coll;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DataDemo 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		System.out.println("Month is.. "+d1.getMonth());
		System.out.println("Hours is.. "+d1.getHours());
		System.out.println("Minuts is.. "+d1.getMinutes());
		System.out.println("Date is.. "+d1.getDate());
		System.out.println("Year is.. "+d1.getYear());
		System.out.println("Second is.. "+d1.getSeconds());
		System.out.println(d1.getTime());
		
		SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(f1.format(d1));
		
		LocalDate l1=LocalDate.now();
		System.out.println(l1);
	}
}
