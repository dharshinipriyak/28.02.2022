package com.objectCloning;

public class Shop implements Cloneable
{
	int Shopid,Openingdate;
	String Shopname,address;
	public Shop() 
	{
		Shopid=76676;
		Openingdate=1999;
		Shopname="RPS Shop";
		address="Kovai";
	}
	public void getShopDetails()
	{	
		System.out.println("Shop Name   :"+Shopname);
		System.out.println("Shop ID     :"+Shopid);
		System.out.println("Since       :"+Openingdate);
		System.out.println("Shop Address:"+address);
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Shop S=new Shop();
		S.getShopDetails();
		 System.out.println("************");
		Shop S2=(Shop) S.clone();
		S2.getShopDetails();
		
	}
}
