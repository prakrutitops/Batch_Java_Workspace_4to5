package com.a82;

import java.util.Scanner;

public class SwitchEx 
{
	public static void main(String[] args) {
		
		System.out.println("Enter Your Number");//printf
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num)
		{
		
			case 1:System.out.println("English");
			break;
			case 2:System.out.println("Hindi");
			break;
			case 3:System.out.println("Guj");
			break;
			
			default:System.out.println("Your Number is not valid");
			break;
		}
		
	}
}
