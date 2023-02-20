package com.task;

public class InSufficientFundException extends Exception 
{
	private String message;

	public InSufficientFundException(String message) 
	{
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	public InSufficientFundException(Throwable cause,String message) 
	{
		super(cause);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
