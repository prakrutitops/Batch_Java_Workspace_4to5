package com.a33;

import java.util.Vector;

public class VectorEx 
{
	
	public static void main(String[] args)
	{
		
		Vector v =new Vector<>(5);
		
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		v.addElement("C");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		
		System.out.println("Size :"+v.size());
		System.out.println("Capacity :"+v.capacity());
		
		if(v.contains("E"))
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}
	
}
