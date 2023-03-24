package com.key;

class SDemo
{
	static class Demo123
	{
		int no1;
		public void show()
		{
			no1=123;
			sno=321;
			System.out.println("no is.. "+no1);
			System.out.println("sno is.. "+no1);
		}
	}
	int no;
	static int sno;
	public static void show()
	{
		sno=321;
		System.out.println("sno is.. +sno");
	}
	static
	{
		sno=0;
		System.out.println("sno in static block is.. "+sno);
	}
}
public class StaticDemo 
{
	public static void main(String[] args) 
	{
		SDemo.Demo123 d1=new SDemo.Demo123();
		d1.show();
		SDemo.show();
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		
		s1.no=10;
		s2.no=20;
		s3.no=30;
		System.out.println("s1.sno is.. "+s1.no);
		System.out.println("s2.sno is.. "+s2.no);
		System.out.println("s3.sno is.. "+s3.no);
		
		s1.sno=10;
		s2.sno=20;
		s3.sno=30;
		System.out.println("s1.sno is.. "+s1.sno);
		System.out.println("s2.sno is.. "+s2.sno);
		System.out.println("s3.sno is.. "+s3.sno);
	}
}
