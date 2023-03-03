package com.a33;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	
	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> hashmap =new HashMap<>();
		
		hashmap.put("A", 101);
		hashmap.put("B", 102);
		hashmap.put("C", 103);
		hashmap.put("D", 104);
		
		//System.out.println(hashmap);
		
		
		System.out.println(hashmap.get("D"));
		
		for(Map.Entry m: hashmap.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		
	}
}
