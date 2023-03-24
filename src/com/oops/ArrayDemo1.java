package com.oops;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args)
	{
		int[] a=new int[5];
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter No.. ");
			a[i]=s1.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
