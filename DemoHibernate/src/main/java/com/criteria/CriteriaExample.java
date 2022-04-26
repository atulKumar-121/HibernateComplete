package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;
public class CriteriaExample {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Student.class);
		List<Student> students=c.list();
		for(Student student:students)
		{
			System.out.println(student.getId()+" "+student.getName());
		}
		
		factory.close();
		
	}

}
