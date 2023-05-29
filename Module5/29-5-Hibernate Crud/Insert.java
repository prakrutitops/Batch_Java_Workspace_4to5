package com.controller;

import java.util.Scanner;

import com.dao.PersonDao;
import com.model.Person;

public class Insert 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String pname = sc.next();
		
		System.out.println("Enter Your Number");
		String pnum = sc.next();
		
		Person p =new Person();
		p.setPname(pname);
		p.setPnum(pnum);
		
		PersonDao.Insert(p);
		
	}
}
