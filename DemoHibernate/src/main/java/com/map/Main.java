package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Question q1=new Question();
		q1.setQuestionId(101);
		q1.setQuestion("What is Java?");
		
		Answer a1=new Answer();
		a1.setAnswerId(202);
		a1.setAnswer("Java is a programming lang.");
		a1.setQuestion(q1);
		
		Answer a2=new Answer();
		a2.setAnswerId(203);
		a2.setAnswer("Java is an object oriented prog lang.");
		a2.setQuestion(q1);
		
		Answer a3=new Answer();
		a3.setAnswerId(204);
		a3.setAnswer("Java has many framework.");
		a3.setQuestion(q1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);
		
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		 
		
		session.getTransaction().commit();
		factory.close();
	}

}
