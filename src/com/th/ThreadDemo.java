package com.th;

class First extends Thread 
{
	public void run()//running state
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("MY First thread is.. "+i);
		}
		System.out.println("My First thread is completed.. ");
	}
}

public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		First f1=new First();// Newborn state
		f1.start();// runneble
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(20000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("My main Thread is.. "+i);
		}
		System.out.println("My main thread is completed.. ");
	}
}





