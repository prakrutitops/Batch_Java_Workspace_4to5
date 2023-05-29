package com.controller;

import java.util.Scanner;

import com.dao.PersonDao;
import com.model.Person;

public class Single {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	System.out.println("Enter id:");
	p.setPid(sc.nextInt());
	Person per = new PersonDao().getSingle(p);
	System.out.println("ID: "+per.getPid()+"\tName: "+per.getPname()+"\tNumber: "+per.getPnum());
}
}
