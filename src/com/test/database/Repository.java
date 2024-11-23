package com.test.database;

public class Repository {
	
	public void insert(String ad)
	{
		System.out.println("ad:"+ad);
	}
	public void delete(String ad)
	{
		System.out.println(ad+", silindi.");
	}
	public void update(String s)
	{ 
		System.out.println("Gelen isim:"+s);
	}

}
