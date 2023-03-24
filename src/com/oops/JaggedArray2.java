package com.oops;

import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter How many Row..  ");
		int row=sc.nextInt();
		int[][] a=new int[row][];
		
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter How Many columns for a["+i+"] = ");
			a[i]=new int[sc.nextInt()];		
			for(int j=0;j<a[i].length ;j++)
			{
				a[i][j]=j+1;
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
