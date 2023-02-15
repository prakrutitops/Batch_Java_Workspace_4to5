package com.a152;

public class MethodOverloadingEx 
{
	
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double c,double d)
	{
		return c*d;
	}
	
	public static void main(String[] args) 
	{
		MethodOverloadingEx m1 =new MethodOverloadingEx();
		
		System.out.println(m1.add(5, 6));
		System.out.println(m1.add(5.00, 6.00));
	}
}
