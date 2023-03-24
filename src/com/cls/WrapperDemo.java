package com.cls;

class Student 
{
	public void show()
	{}
}
public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);//AutoBoxing
		System.out.println("AutoBoxing is.. "+i1);
		
		int a=100;
		Integer i2=new Integer(a);//Boxing
		System.out.println("Boxing is.. "+i2);
		
		int z=i1.intValue();//UnBoxing
		System.out.println("Direct is.. "+z);
		
		String s="786";
		int x=Integer.parseInt(s);//UnBoxing
		System.out.println("Unboxing is.. "+x);
		
		Object o1=new Object();
		Student s1=new Student();
	}
}
