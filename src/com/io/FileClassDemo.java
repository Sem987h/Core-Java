package com.io;

import java.io.File;
import java.io.IOException;

class FDemo
{
	File file;
	public FDemo()
	{
		file=new File("a3.txt");
		try 
		{
			file.createNewFile();
			display();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void display()
	{
		System.out.println("is directory or not.. "+file.isDirectory());
		System.out.println("is File or not.. "+file.isFile());
		System.out.println("can i read the file.. "+file.canRead());
		System.out.println("can is write the file.. "+file.canWrite());
		System.out.println("path is.. "+file.getPath());
		System.out.println("Full Path is.. "+file.getAbsolutePath());
	}
}

public class FileClassDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
	}
}
