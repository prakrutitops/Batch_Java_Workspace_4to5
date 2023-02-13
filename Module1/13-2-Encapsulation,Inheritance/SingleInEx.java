package com.a132;

class A
{
	void a1()
	{
		System.out.println("A1 Executed");
	}
}
class B extends A
{
	void b1()
	{
		System.out.println("B1 Executed");
	}
}

public class SingleInEx 
{
	public static void main(String[] args) {
		
		
		B myb =new B();
		
		myb.a1();
		myb.b1();
		
		
	}
}
