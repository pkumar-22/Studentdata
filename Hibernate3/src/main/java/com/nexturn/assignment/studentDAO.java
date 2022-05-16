package com.nexturn.assignment;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;

public class studentDAO {
	Scanner sc=new Scanner(System.in);
	
	public void addRecords(Student student) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		org.hibernate.SessionFactory factory=cfg.buildSessionFactory();
		org.hibernate.Session session=factory.openSession();
		
		org.hibernate.Transaction tx=session.beginTransaction();
		
		System.out.println("Enter roll number");
		student.setRollNo(sc.nextInt());
		System.out.println("Enter name");
		sc.nextLine();
		student.setName(sc.nextLine());
		System.out.println("Enter age");
		student.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter class section");
		student.setClassSection(sc.nextLine());
		
		System.out.println("Enter address");
		student.setAddress(sc.nextLine());
		
		session.save(student);
		tx.commit();
		System.out.println("Inserted Record succesfully");
		
		session.close();
		factory.close();
		
	}
	public Student read() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		org.hibernate.SessionFactory factory=cfg.buildSessionFactory();
		org.hibernate.Session session=factory.openSession();
		
		org.hibernate.Transaction tx=session.beginTransaction();
		System.out.println("enter roll number for details");
		Student s=session.get(Student.class, sc.nextInt());
		session.close();
		factory.close();
		
		
		return s;
		
		
		
		
	}

}