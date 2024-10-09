package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sept");
		EntityManager entity = factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Address ad = new Address();
		ad.setColony("gandhi nagar");
		ad.setState("ap");
		ad.setPincode(521185);
		
		Student st = new Student();
		st.setStname("uday");
		st.setAddress(ad);
		
		entity.persist(st);
		
		entity.getTransaction().commit();
	}
}
