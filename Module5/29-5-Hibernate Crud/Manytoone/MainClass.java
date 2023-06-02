package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) {
		
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		
		Scanner sc =new Scanner(System.in);
		
		Person p =new Person();
		System.out.println("Enter Your Name");
		String name = sc.next();
		p.setName(name);
		
		
		
		
		Address a =new Address();
		Address a1 =new Address();
		
		System.out.println("Enter Your Address1");
		String add1 = sc.next();
		a.setAddr(add1);
		a.setPerson(p);
		
		System.out.println("Enter Your Address2");
		String add2 = sc.next();
		a1.setAddr(add2);
		a1.setPerson(p);
	
		sess.save(p);
		sess.save(a);
		sess.save(a1);
		tr.commit();
		sess.close();
	
	
		
		
		
	}
}
