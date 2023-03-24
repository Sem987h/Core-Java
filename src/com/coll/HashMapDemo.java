package com.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		System.out.println("Default size is.. "+hm.size());
		System.out.println(hm);
		hm.put(1, "Hemang");
		hm.put("Hemang", 123);
		hm.put("T", "Tops");
		System.out.println("Now size is.. "+hm.size());
		System.out.println(hm);
		System.out.println(hm.get(1));
		hm.remove(1);
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println("Key is.. "+me.getKey());
			System.out.println("Value is.. "+me.getValue());
			System.out.println();
		}
	}
}
