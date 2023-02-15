package com.a152;

class A
{
	String color ="black";
}
class B extends A
{
	String color ="white";
	
	 void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	public static void main(String[] args) 
	{
		
		
		B b =new B();
		b.display();
		
	}
}
