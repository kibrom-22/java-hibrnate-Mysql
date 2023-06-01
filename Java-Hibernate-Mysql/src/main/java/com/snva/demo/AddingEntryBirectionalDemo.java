package com.snva.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class AddingEntryBirectionalDemo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Student.class)
				                     .addAnnotatedClass(StudentDetail.class)
				                     .buildSessionFactory();
		
		try(Session session = factory.getCurrentSession()){
			Student s1 = new Student("Kibrom","Abel","kibrom@gmail.com");
			StudentDetail sd = new StudentDetail("SNVA",20);
			
			s1.setStudentGfgDetail(sd);
			sd.setStudent(s1);
			session.beginTransaction();
			session.save(sd);
			session.getTransaction().commit();
			System.out.println("Transaction successfully completed");
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		}

}
