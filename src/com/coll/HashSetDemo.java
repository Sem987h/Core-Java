package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		System.out.println("Default size is.. "+h1.size());
		System.out.println(h1);
		h1.add(123);
		h1.add('T');
		h1.add(10.01f);
		h1.add("Tops");
		h1.add(new Integer(100));
		h1.add("tops");
		System.out.println(h1);
		System.out.println("Now size is.. "+h1.size());
		h1.remove("Tops");
		System.out.println(h1);
		System.out.println("Now size is.. "+h1.size());
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
