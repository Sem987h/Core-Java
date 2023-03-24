package com.key;

class FDemo
{
	final int no=786;
	String name;
	public final void setData()
	{
		name="ABCD";
	}
	public void display()
	{
		System.out.println("no is.. "+no);
		System.out.println("Name is.. "+name);
	}
}
public class FinalDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
		f1.setData();
		f1.display();
	}
}
