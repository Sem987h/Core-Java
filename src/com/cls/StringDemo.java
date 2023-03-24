package com.cls;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1=new String("This is Tops Technologies.. ");
		System.out.println("Origional is.. "+s1);
		System.out.println("Length is.. "+s1.length());
		System.out.println("Uppercase is.. "+s1.toUpperCase());
		System.out.println("Lowercase is.. "+s1.toLowerCase());
		System.out.println("subString is.. "+s1.substring(2));
		System.out.println("subString is.. "+s1.substring(0,2));
		System.out.println("Charat is.. "+s1.charAt(2));
		
	}
}
