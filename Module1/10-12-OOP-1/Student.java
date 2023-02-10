package com.a102;

import java.util.Scanner;

public class Student 
{
	
	static int id=0;
	static String name="";
	
	public static void main(String[] args) 
	{
		
		//object creation
		
		//classname objname = new classname();
		
		Student s1 = new Student();  
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Id: ");
		id = sc.nextInt(); 
		System.out.println("Enetr Your Name:");
		name = sc.next();
		
		s1.id=id;
		s1.name=name;
		
		/*s1.id=101;
		s1.name="Xyz";*/
		
		System.out.println(s1.id+" "+s1.name);
		
		
		
	}
}
