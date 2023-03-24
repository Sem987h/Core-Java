package com.cls;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("This is Tops Technologies.. ");
		System.out.println("Origional is.. "+s1);
		System.out.println("Length is.. "+s1.length());
		s1.insert(0, "Hii ");
		System.out.println("Origional is.. "+s1);
		System.out.println("Length is.. "+s1.length());
		s1.append("Hemang Goswami.. ");
		System.out.println("Origional is.. "+s1);
		System.out.println("Length is.. "+s1.length());
		s1.delete(0, 4);
		System.out.println("Origional is.. "+s1);
		System.out.println("Length is.. "+s1.length());
		System.out.println(s1.reverse());
	}
}
