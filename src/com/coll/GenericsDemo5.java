package com.coll;

import java.util.ArrayList;

public class GenericsDemo5 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> i1=new ArrayList<Character>();
		i1.add('T');
		i1.add(new Character('H'));
		System.out.println(i1);
	}
}
