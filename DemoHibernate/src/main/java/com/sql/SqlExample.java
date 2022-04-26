package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.model.Student;

public class SqlExample {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		String query="select * from student";
		NativeQuery sqlQuery = session.createSQLQuery(query);
		List<Object[]> students=sqlQuery.list();
		for(Object[] student:students)
		{
			System.out.println(Arrays.toString(student));
		}
		
		
		session.close(); 
		factory.close();
	}

}
