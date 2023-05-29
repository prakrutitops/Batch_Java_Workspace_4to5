package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Person;

public class PersonDao 
{
	
	public static void Insert(Person p)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.save(p);
		tr.commit();
		sess.close();
	}
	
	public static void Delete(Person p)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(p);
		tr.commit();
		sess.close();
	}
	
	
	public static void Update(Person p)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.update(p);
		tr.commit();
		sess.close();
	}
	
	
	public List<Person> viewRecords()
	{
		Session sess = new Util().getConnect();
		List<Person> getall = sess.createQuery("from Person").list();
		
		sess.close();
		return getall;
	}
	
	public Person getSingle(Person p)
	{
		Session sess = new Util().getConnect();
		Person person = (Person) sess.get(Person.class, p.getPid());
		
		sess.close();
		return person;
	}
	
	
}
