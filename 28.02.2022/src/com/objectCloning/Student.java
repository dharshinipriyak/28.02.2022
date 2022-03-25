package com.objectCloning;

public class Student implements Cloneable //step1 implements clonable
{
	int RegNo;			//variables
	String Sname;
	String Saddress, Section;
	public Student()  //constructor
	{
		RegNo=2456;
		Sname="Tara";
		Saddress="Pondy";
		Section="A1";
	}
	public  void getSdetails() //methods
	{
		System.out.println(RegNo);
		System.out.println(Sname);
		System.out.println(Saddress);
		System.out.println(Section);
	}
	public static void main(String[] args) throws CloneNotSupportedException //step2  declare CloneNotSupportedException
	{
		Student Std1=new Student(); //step 3 original object
		Std1.getSdetails();
		System.out.println("*************");
		Student Std2=(Student) Std1.clone(); //step 4 call clone
		Std2.getSdetails();
		
	}
	
}
