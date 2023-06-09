package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class MyDao extends HibernateDaoSupport
{
	
	public void insertperson(Person p)
	{
		getHibernateTemplate().save(p);
	}
	
}
