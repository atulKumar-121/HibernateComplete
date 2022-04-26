package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Main_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Student st=(Student)session.get(Student.class,101);
		System.out.println(st);
		session.close();

	}

}
