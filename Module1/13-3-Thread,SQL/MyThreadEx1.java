package com.a133;

class A extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A: "+i);
		}
	}
	void a1()
	{
		
	}
}
class B extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B: "+i);
		}
	}
}

public class MyThreadEx1 
{
	
	public static void main(String[] args) {
		
		A a =new A();
		B b =new B();
		
		a.start();
		b.start();
		
		
	}
	
}
