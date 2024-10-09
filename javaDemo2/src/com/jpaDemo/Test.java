package com.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sept");
		EntityManager entity = factory.createEntityManager();
		
		// persit() //remove() fetch-findi-merge();
		
		entity.getTransaction().begin();
		
		Employee emp = new Employee(159,"uday","hyd",10000);
		
	    entity.persist(emp); // inserting record into database
		
		Employee result = entity.find(Employee.class, 159);
//		System.out.println(result.getEmpadd()+" "+result.getEmpname());
		
//		result.setEmpadd("goa");
//		result.setEmpname("bahu");
		
//		entity.remove(emp);
		
//		entity.merge(result);
		entity.getTransaction().commit();
	}
}
