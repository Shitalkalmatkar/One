package com.jsp.Person_Pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shital");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Pan pan=new Pan();
	pan.setName("vidya");
	Adhar adhar=new Adhar();
	adhar.setName("vidya");
	adhar.setNumber("123456789012");
	
	
	Person person =new Person();
			person.setName("vidya");
			person.setEmail("vidya@gmail.com");
			person.setPan(pan);
			person.setAdhar(adhar);
		
			
			entityTransaction.begin();
			entityManager.persist(person);
			entityManager.persist(pan);
		    entityManager.persist(adhar);
			entityTransaction.commit();
			System.out.println("all good");
			
			
			
	
	
	
	
	
	
}
}
