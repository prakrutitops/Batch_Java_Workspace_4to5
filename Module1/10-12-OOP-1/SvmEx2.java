package com.a102;

public class SvmEx2 
{
	int id;
	String name;
	static String college="XYZ";
	
	
	public SvmEx2(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	 static void change()
	{
		college="ABC";
	}
	
	public static void main(String[] args)
	{
			
		change();
	
		SvmEx2 s1 =new SvmEx2(101,"A");
		SvmEx2 s2 =new SvmEx2(102,"B");
		SvmEx2 s3 =new SvmEx2(103,"C");
		
	
		s1.display();
		s2.display();
		s3.display();
		
		
	
	}
}
