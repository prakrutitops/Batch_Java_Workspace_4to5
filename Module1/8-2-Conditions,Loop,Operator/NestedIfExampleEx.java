package com.a82;

public class NestedIfExampleEx 
{
	public static void main(String[] args) {
		
		
		int age = 80;
		
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
			
			if(age>=60)
			{
				System.out.println("You are senior Citizen");
			}
			else
			{
				System.out.println("You are Young ");
			}
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		
	}
}
