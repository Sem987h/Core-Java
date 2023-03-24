package com.oops;


	class Employee3
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
class Department3 extends Employee3
{
		int did;
		String dname;
		public void setDeprtmentData()
		{
			did=1;
			dname="It Department";
		}
		public void display()
		{
			System.out.println("Eid is.. "+eid);
			System.out.println("Ename is.. "+ename);
			System.out.println("City is.. "+city);
			System.out.println("Department id is.. "+did);
			System.out.println("Dname is.. "+dname);
		}
}
class Division3 extends Employee3
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
			System.out.println("Division name is.. "+divname);
		}
	}
public class Hirarchicle 
{
		public static void main(String[] args)
		{
			Division d1=new Division();
			d1.setEmployeeData();
			d1.setDivisionData();
			d1.display();
			
			Division dd1=new Division();
			dd1.setEmployeeData();
			dd1.setDivisionData();
			dd1.display();
		}
	}

