package com.bo;

import com.dao.MyDao;
import com.model.Person;

public class MyBo 
{
	MyDao myDao;
	
	
	
	public MyDao getMyDao() {
		return myDao;
	}



	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}



	public void insertperson(Person p)
	{
		myDao.insertperson(p);
	}
	
}
