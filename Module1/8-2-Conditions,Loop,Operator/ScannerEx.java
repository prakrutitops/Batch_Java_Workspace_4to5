package com.a82;

import java.util.Scanner;

public class ScannerEx 
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		
		System.out.println(id+" "+name+" "+salary);
	}
}
