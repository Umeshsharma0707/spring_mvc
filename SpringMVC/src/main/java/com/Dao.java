package com;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class Dao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {;
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insertUser() {
		
	}
}
