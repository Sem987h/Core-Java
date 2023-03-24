package com.ex;

public class ExeptioDemo2 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] a=new int[5];
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error1");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("error2");
			e.printStackTrace();
		}
	}
}
