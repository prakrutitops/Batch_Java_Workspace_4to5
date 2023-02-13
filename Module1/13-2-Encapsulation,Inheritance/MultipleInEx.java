package com.a132;

interface M
{
	void m();//abstract method
}
interface N
{
	void n();
}
class P implements M,N
{

	@Override
	public void n() {
		// TODO Auto-generated method stub
		System.out.println("N Executed");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("M Executed");
	}
	
}

public class MultipleInEx 
{
	public static void main(String[] args) {
		
		P p =new P();
		p.m();
		p.n();
	
		
		
	}
}
