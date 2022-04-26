package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
	
		Person person=new Person(101,"Atul","Kumar","asdfgh");
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
