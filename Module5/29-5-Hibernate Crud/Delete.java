package com.controller;

import java.util.Scanner;

import com.dao.PersonDao;
import com.model.Person;

public class Delete 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter id:");
		p.setPid(sc.nextInt());
		
		new PersonDao().Delete(p);
		
	}
}
