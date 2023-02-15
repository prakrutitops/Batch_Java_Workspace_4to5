package com.a152;

class Rbi
{
	int rate()
	{
		return 0;
	}
}

class Sbi extends Rbi
{
	int rate()
	{
		return 5;
	}
}
class Icici extends Rbi
{
	int rate()
	{
		return 6;
	}
}
class Axis extends Rbi
{
	int rate()
	{
		return 7;
	}
}

public class MethodOverridingEx 
{
	public static void main(String[] args)
	{
		Rbi rb; // refrence variable
		
		rb = new Sbi();
		System.out.println(rb.rate());
		
		rb = new Icici();
		System.out.println(rb.rate());
		
		rb = new Axis();
		System.out.println(rb.rate());
		
		
	}
}
