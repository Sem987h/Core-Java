package com.coll;

import java.util.ArrayList;

public class GenericsDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> i1=new ArrayList<String>();
		i1.add("Tops");
		i1.add(new String("Hemang"));
		System.out.println(i1);
	}
}
