package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerealizedDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Student s1=new Student();
			s1.setCountry("India");
			s1.setState("Gujrat");
			s1.setCity("Ahmedabad");
			
			oos.writeObject(s1);
			oos.flush();
			fos.flush();
			fos.close();
			System.out.println("Data Write.. ");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
