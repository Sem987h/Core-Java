package com.coll;

import java.util.ArrayList;

public class GenericsDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(123);
		i1.add(new Integer(100));
		System.out.println(i1);
	}
}
