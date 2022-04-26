package com.mapmanytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Atul Kumar");
		Employee emp2=new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("Ayush Raj");
		
		Project pro1=new Project();
		pro1.setpId(202);
		pro1.setProjectName("Library Managment System");
		Project pro2=new Project();
		pro2.setpId(203);
		pro2.setProjectName("chat box");
		
		List<Employee> l1=new ArrayList<Employee>();
		List<Project> l2=new ArrayList<Project>();
		
		l1.add(emp1);
		l1.add(emp2);
		
		l2.add(pro1);
		l2.add(pro2);
		
		emp1.setProjects(l2);
		pro2.setEmployees(l1);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(pro1);
		session.save(pro2);
		
		session.getTransaction().commit();
		
		
		
		factory.close();

	}

}
