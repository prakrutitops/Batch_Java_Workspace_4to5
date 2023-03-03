package com.a33;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		
		LinkedList<String>list =new LinkedList<>();
		list.add("Android");
		list.add("Java");
		list.addFirst("Ios");
		list.addLast("Php");
		
		
		System.out.println(list);
	}
}
