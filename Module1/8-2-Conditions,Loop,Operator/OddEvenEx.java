package com.a82;

import java.util.Scanner;

public class OddEvenEx 
{
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}
}
