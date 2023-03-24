package com.oops;

class Sum
{
	int x,y;
	public Sum()
	{
		x=10;
		y=20;
		System.out.println("First sum is.. "+(x+y));
	}
	public Sum(int a)
	{
		x=y=a;
		System.out.println("Second sum is.. "+(x+y));
	}
	public Sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Third sum is.. "+(x+y));
	}
	public Sum(Sum s1)
	{
		x=s1.x;
		y=s1.y;
		System.out.println("Copy sum is.. "+(x+y));
	}
}
public class ConstuctorDemo 
{
	public static void main(String[] args)

	{
		Sum s1=new Sum();
		new Sum(123);
		new Sum(123,321);
		new Sum(s1);
	}
}

