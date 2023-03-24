package com.coll;

import java.util.ArrayList;

public class GenericsDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Long> i1 = new ArrayList<Long>();
		i1.add((long) 12345678);
		i1.add(new Long(100));
		System.out.println(i1);
	}
}
