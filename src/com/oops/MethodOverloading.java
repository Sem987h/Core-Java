package com.oops;
class Addition
{
	int x,y;
	public void sum()
	{
		x=20;
		y=10;
		System.out.println("First sum is.."+(x+y));
	}
	public void sum(int a)
	{
		x=y=a;
		System.out.println("Second sum is.."+(x+y));
	}
	public void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Third sum is.."+(x+y));
	}
}
public class MethodOverloading 
{

	public static void main(String[] args)
	{
		Addition a1=new Addition();
		a1.sum();
		a1.sum(50);
		a1.sum(123, 321);
	}

}
