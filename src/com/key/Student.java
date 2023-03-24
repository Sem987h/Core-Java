package com.key;

interface Result
{
	String grade="+A";
}

public interface Student extends Result
{
	int sno=10;
	public void setData();
}
