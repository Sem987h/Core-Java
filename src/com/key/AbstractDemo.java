package com.key;

abstract class ADemo
{
	int no;
	String name;
	public abstract void setData();
	public void display()
	{
		System.out.println("no is.. "+no);
		System.out.println("Name is.. "+name);
	}
}
abstract class Demo extends ADemo
{
}
class Demo1 extends Demo
{

	@Override
	public void setData() 
	{
		no=113;
		name="Hemang";
	}
	
}
public class AbstractDemo
{
	public static void main(String[] args)
	{
		Demo1 a1=new Demo1();
		a1.setData();
		a1.display();
	}
}



