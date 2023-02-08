package com.a82;

public class ShorthandOpEx 
{
	public static void main(String[] args) {
		
		int a=5;
		int b=2;
		
		//int c=a+b;
		a+=b; // a=a+b
		System.out.println(a);//7
	
		a-=b;//a=a-b
		System.out.println(a);//5
		
		a*=b;
		System.out.println(a);//10
		
		a/=b;
		System.out.println(a);//5
	}
}
