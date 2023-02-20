package com.task;

import java.util.Scanner;

public class Exception1 
{
	int deposit, withdraw;
	static int UWidMoney;
	private int balance = 10000;
	
	void deposit(int amount)
	{
		balance += amount;
	}
	
	void withdraw(int UWidMoney) throws InSufficientFundException
	{
		if(UWidMoney > balance)
		{
			int amount = balance-UWidMoney;
			throw new InSufficientFundException("You Need More Money "+amount);
		}
		else
		{
			balance -= UWidMoney;
			System.out.println("Transaction Success Remaining balance is :"+balance);
		}
	}
	
	public static void main(String[] args) throws InSufficientFundException 
	{
		Exception1 e =new Exception1();
		System.out.println("Account Balance : " + e.balance);
		
		System.out.println("Enter Your Amount for Withdrawal");
		Scanner sc =new Scanner(System.in);
		UWidMoney= sc.nextInt();
		e.withdraw(UWidMoney);
		
		
		
	}
}
