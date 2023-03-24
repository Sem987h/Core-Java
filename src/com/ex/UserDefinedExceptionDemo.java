package com.ex;

import java.util.Scanner;

class NoBalanceException extends Exception
{
	double amount;
	public NoBalanceException(double amount) 
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
}
class ATM
{
	double balance;
	public void diposit(double amount)
	{
		balance += amount;
		System.out.println(amount+ "rs deposited successfully..");
	}
	public void withdrawal(double amount) throws NoBalanceException
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println(amount+ "rs Withdrawal successfully.. ");
		}
		else
		{
			double diff=amount - balance;
			throw new NoBalanceException(diff);
		}
	}
}
public class UserDefinedExceptionDemo 
{
	public static void main(String[] args) 
	{
		ATM a1=new ATM();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount for Deposit.. ");
		double amount=sc.nextDouble();
		
		a1.diposit(amount);
		
		System.out.println("Enter amount for Withdrawal.. ");
		amount =sc.nextDouble();
		
		try
		{
			a1.withdrawal(amount);
		}
		catch (NoBalanceException e)
		{
			System.out.println("If you enter "+e.getAmount() + "rs.more in your account then withdrawal "+amount+ "rs..");
		}
	}
}