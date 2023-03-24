package com.key;

class Abc
{
	int mobno;
	public void setMobile()
	{
		mobno=1231231231;
	}
}
class Staff extends Abc implements Student
{
	String name="Hemang";

	@Override
	public void setData() 
	{
		System.out.println("sno is.. "+sno);
		System.out.println("Name is.. "+name);
		System.out.println("MobNo is.. "+mobno);
		System.out.println("Grade is.. "+grade);
	}
	
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Staff s1=new Staff();
		s1.setMobile();
		s1.setData();
	}
}
