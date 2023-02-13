package com.a132;

class C
{
	void c()
	{
		System.out.println("C Executed");
	}
}
class D extends C
{
	void d()
	{
		System.out.println("D Executed");
	}
}
class E extends D
{
	void e()
	{
		System.out.println("E Executed");
	}
}


public class MultilevelInEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		E e =new E();
		e.c();
		e.d();
		e.e();
		
	}

}
