package com.a132;

class J
{
	void j()
	{
		System.out.println("J executed");
	}
}
class K extends J
{
	void k()
	{
		System.out.println("K executed");
	}
}
interface L
{
	void l();
}
class R extends K implements L
{
	void r()
	{
		System.out.println("R executed");
	}

	@Override
	public void l() 
	{
		System.out.println("L Executed");
		
	}
}

public class HybridInEx 
{
	public static void main(String[] args) 
	{
		R r =new R();
		
		r.j();
		r.k();
		r.l();
		r.r();
	}
}
