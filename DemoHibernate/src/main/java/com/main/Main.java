package com.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student st=new Student();
		st.setId(101);
		st.setName("Atul Kumar");
		st.setCity("Delhi"); 
		Address ad=new Address();
		ad.setAddedDate(new Date());
		ad.setCity("Purnea");
		ad.setStreet("navaratan");
		ad.setOpen(true);
		ad.setX(123.123);
		Session session =factory.openSession();
		session.beginTransaction();
		session.save(st);
		session.save(ad);
		session.getTransaction().commit();
		session.close();

	}

}
