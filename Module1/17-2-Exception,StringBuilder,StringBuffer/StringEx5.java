package com.a172;

public class StringEx5 
{
	public static void main(String[] args) {
		
		String s1 ="sachin";
		String s2="  sachin  ";
		String s3 ="SACHIN";
		
		
		System.out.println(s1);
		System.out.println(s2.trim());
		
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("n"));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
	}
}
