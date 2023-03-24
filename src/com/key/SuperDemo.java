package com.key;

class First
{
	int no;
	String name;
	public void setData()
	{
		no=10;
		name="Smit";
	}
}
class Second extends First
{
	int no;
	public void setsecond()
	{
		no=321;
	}
	public void show()
	{
		super.setData();
		System.out.println("No is.. "+no);
		System.out.println("Name is.. "+name);
		System.out.println("Super Class no is.. "+super.no);
	}
}
public class SuperDemo 
{
	public static void main(String[] args) 
	{
		Second s1=new Second();
		s1.setsecond();
		s1.show();
	}
}
