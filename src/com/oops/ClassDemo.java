package com.oops;
class Student
{
	int sid; // data member
	String sname,city;
	private void setData() // member function
	{
		sid=1;  // s = Student
		sname="Hemang";
		city="Ahmedabad";
	}
	public void display()
	{
		setData();
		System.out.println("Sid is... "+sid);
		System.out.println("Sname is... "+sname);
		System.out.println("City  is... "+city);
	}
}
public class ClassDemo
{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.display();
		s1.sid=123;
		System.out.println("in main class sid is.. "+s1.sid);
	}
}
	
