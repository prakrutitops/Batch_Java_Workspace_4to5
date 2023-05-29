package com.controller;

import java.util.Iterator;
import java.util.List;

import com.dao.PersonDao;
import com.model.Person;

public class Select {
public static void main(String[] args) 
{
	List<Person> list = new PersonDao().viewRecords();
	System.out.println("ID\t|\tName\t|\tNumber");
	int i=0;
	for (Person person : list) 
	{
		i++;
		System.out.println(person.getPid()+"\t|\t"+person.getPname()+"\t|\t"+person.getPnum());
		
	}
}
}
