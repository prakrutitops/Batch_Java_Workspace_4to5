package com.a172;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("M Executed");
	}
}
class N extends M
{
	void n() throws IOException
	{
		
	}
}
class P extends N
{
	void p() throws IOException
	{
		
	}
}

public class ThrowsEx 
{
	public static void main(String[] args)  
	{
		P p =new P();
		
		try 
		{
			p.m();
			p.n();
			p.p();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
