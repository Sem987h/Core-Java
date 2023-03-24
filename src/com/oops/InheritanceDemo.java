package com.oops;

class Employee
{
	int eid;
	String ename, city;
	public void setEmployeeData()
	{ 
		eid=123;
		ename="Hemang";
		city="Ahmedabad";
	}
}
class Department extends Employee
{
	int did;
	String dname;
	public void setDeprtmentData()
	{
		did=1;
		dname="It Department";
	}
}
class Division extends Department
{
	String divname;
	public void setDivisionData() 
	{
		divname="B Division";
	}

	public void display()
	{
		System.out.println("Eid is.. "+eid);
		System.out.println("Ename is.. "+ename);
		System.out.println("City is.. "+city);
		System.out.println("Department id is.. "+did);
		System.out.println("Dname is.. "+dname);
		System.out.println("Division name is.. "+divname);
	}
}
public class InheritanceDemo
{
	public static void main(String[] args)
	{
		Division d1=new Division();
		d1.setEmployeeData();
		d1.setDivisionData();
		d1.setDeprtmentData();
		d1.display();
	}
}





