package com.coll;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector(2,1);
		System.out.println("Default Size is.. "+v1.size());
		System.out.println("Default Capicity is.. "+v1.capacity());
		System.out.println();
		
		v1.addElement(123);
		v1.add('T');
		v1.add(new Integer(100));
		v1.add("Tops");
		v1.add(20.02f);
		v1.add("Tops");
		System.out.println("Now size is.. "+v1.size());
		System.out.println("Now Capacity is.. "+v1.capacity());
		System.out.println(v1);
		
		Iterator i1=v1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
	}
}
