package com.a172;

public class ThrowEx 
{
	
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid");
		}
		else
		{
			System.out.println("Welcome to Vote");
		}
	}
	
	public static void main(String[] args) {
		
		validate(15);
		
	}
	
}
