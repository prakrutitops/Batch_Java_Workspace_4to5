package com.a33;

import java.util.Stack;

public class StackEx 
{
	static void push(Stack st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
		
	}
	static void pop(Stack st)
	{
		Integer i = (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
		
	}
	
	public static void main(String[] args) 
	{
		Stack st =new Stack<>();
		
		push(st,10);
		push(st,11);
		push(st,12);
		push(st,13);
		try
		{
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
		}
		catch(Exception e)
		{
			System.out.println("No Data");
		}
		
		
		
	}
}
