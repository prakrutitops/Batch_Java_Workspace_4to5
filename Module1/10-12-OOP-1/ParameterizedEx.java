package com.a102;

public class ParameterizedEx 
{
	int id;
	String name;
	
	public ParameterizedEx(int id,String name)
	{
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		
		ParameterizedEx p1 =new ParameterizedEx(101,"AVADH");
		ParameterizedEx p2 =new ParameterizedEx(102,"YASH");
		
		/*System.out.println(p1.id+" "+p1.name);
		System.out.println(p2.id+" "+p2.name);*/
		
		p1.display();
		p2.display();
		
		
	}
	
}
