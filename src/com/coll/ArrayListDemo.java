package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is.. "+a1.size());
		System.out.println(a1);
		a1.add(123);
		a1.add('T');
		a1.add(10.02f);
		a1.add("Tops");
		a1.add(new Integer(100));
		a1.add("Tops");
		
		System.out.println(a1);
		System.out.println("Now size is.. "+a1.size());
		a1.remove(1);
		System.out.println(a1);
		System.out.println("Now size is.. "+a1.size());
		a1.remove("Tops");
		System.out.println(a1);
		System.out.println("Now size is.. "+a1.size());
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
