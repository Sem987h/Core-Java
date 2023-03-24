package com.ex;

import java.util.Scanner;

public class ExeptionDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no 1 : ");
			int a=sc.nextInt();
			System.out.println("Enter no 2 : ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Devision is.. "+c);
			System.out.println("Program is Completed.. ");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This program is Develoed by : Hemang... ");
		}
		System.out.println("Hiii... ");
	}
}
