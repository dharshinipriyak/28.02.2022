package com.objectCloning;

public class Employee implements Cloneable 
{
	int Eid,Joindate;
	String Ename,Eaddress;
	public Employee() 
	{
		Eid=5356;
		Joindate=2022;
		Ename="Ravi";
		Eaddress="Chennai";
	}
	public void getEmpDetails()
	{	
		System.out.println("Employee Name   :"+Ename);
		System.out.println("Employee ID     :"+Eid);
		System.out.println("Join Date       :"+Joindate);
		System.out.println("Employee Address:"+Eaddress);
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee E=new Employee();
		E.getEmpDetails();
		 System.out.println("************");
		Employee E2=(Employee) E.clone();
		E2.getEmpDetails();
		
	}

}
