package com.coll;

import java.util.ArrayList;

public class GenericsDemo3 
{
	public static void main(String[] args) 
	{
		ArrayList<Float> i1=new ArrayList<Float>();
		i1.add(20.04f);
		i1.add(new Float(100));
		System.out.println(i1);
	}
}
