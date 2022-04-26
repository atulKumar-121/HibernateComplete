package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;
import com.mysql.cj.Query;

public class HqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		String query="from Student";
		Session session=factory.openSession();
		/**
		 * 
		 */
		List<Student> students=(List<Student>)session.createQuery(query).list();
		for(Student student:students)
		{
			System.out.println(student.getName()+" "+student.getId()+" "+student.getCity());
		}
		

	}

}
