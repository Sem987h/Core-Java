package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserealizedDemo 
{
	public static void main(String[] args) 
	{
		DeserealizedDemo d1=new DeserealizedDemo();
		Student s1=d1.getDeserealizedData();
		System.out.println(s1);
	}
	public Student getDeserealizedData()
	{
		Student s1=null;
		try 
		{
			FileInputStream fis=new FileInputStream("abc.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s1=(Student)ois.readObject();
			fis.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return s1;
	}
}
