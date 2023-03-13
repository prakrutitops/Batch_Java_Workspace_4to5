package com.a133;

class C implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread C: "+i);
		}
	}
	
}
class D implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread D: "+i);
		}
	}
	
}
public class MyThreadEx2 
{
	public static void main(String[] args) {
		
		Thread t1 =new Thread(new C());
		Thread t2 =new Thread(new D());
		
		t1.start();
		t2.start();
		
	}
}
