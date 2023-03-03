package com.a33;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList<String> arrayList =new ArrayList<>();
		arrayList.add("Php");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add(".Net");
	
		
		ArrayList<String> arrayList2 =new ArrayList<>();
		arrayList2.add("Android");
		arrayList2.add("Iphone");
		arrayList2.add("Java");
		
		//arrayList.addAll(arrayList2);
		//arrayList.remove("Java");
		//arrayList.removeAll(arrayList2);
		
		arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//System.out.println(arrayList);
		
	}
	
}
