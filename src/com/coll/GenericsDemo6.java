package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo6 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		System.out.println("Default size is.. "+a1.size());
		System.out.println(a1);
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("Smit");
		s1.setCity("Kheda");
		s1.setAddress("Panjrapod");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("Chirag");
		s2.setCity("Ahmedabad");
		s2.setAddress("Nikol");
		
		Student s3=new Student();
		s3.setSid(3);
		s3.setSname("Aman");
		s3.setCity("Baroda");
		s3.setAddress("Ranip");
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		System.out.println("Now size is.. "+a1.size());
		System.out.println(a1);
		
		Iterator<Student> i1=a1.iterator();
		while(i1.hasNext())
		{
			Student s=i1.next();
			System.out.println("Sid is.. "+s.getSid());
			System.out.println("SName is.. "+s.getSname());
			System.out.println("City is.. "+s.getCity());
			System.out.println("Address is.. "+s.getAddress());
			System.out.println();
		}
	}
}
