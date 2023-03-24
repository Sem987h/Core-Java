package com.oops;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter Eno.. ");
		int eno=sc.nextInt();
		
		System.out.println("Enter Ename.. ");
		String ename=sc1.nextLine();
		
		System.out.println("Enter Gender M/F  ");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter Degree.. ");
		String degree = sc1.next();
		
		System.out.println("Eno is.. "+eno);
		System.out.println("Ename is.. "+ename);
		System.out.println("Gender is.. "+gender);
		System.out.println("Degree is.. "+degree);
	}

}
