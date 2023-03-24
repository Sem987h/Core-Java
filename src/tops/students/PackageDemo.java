package tops.students;

import tops.faculty.FacultyDemo;

class PDemo extends StudentDemo
{
	public void setData()
	{
		no=123;
		
	}
}
public class PackageDemo
{
	public static void main(String[] args) 
	{
		StudentDemo s1=new StudentDemo();
		s1.setStudentData();
		System.out.println("no is.. "+s1.no);
		
		FacultyDemo f1=new FacultyDemo();
		f1.setStudentData();
		f1.show();
	}
}
