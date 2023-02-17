package com.a172;

public class StringEx3 
{
	public static void main(String[] args) {
		
		String s1 ="sachin";
		String s2 ="sachin";
		String s3 ="SACHIN";
		String s4="dhruvil";
		String s5 =new String("sachin");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s4.compareTo(s1));
		System.out.println(s1.equals(s5));
		
		//==
		System.out.println(s1==s2);
		System.out.println(s1==s5);
	
		
	}
}
