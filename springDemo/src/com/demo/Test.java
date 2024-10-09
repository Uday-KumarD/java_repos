package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		
		// loosly coupled
		Resource resource = new ClassPathResource("SpringConfig.xml");
		// spring will give the emp object
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp =(Employee) factory.getBean("uday");
		emp.display();
	}
}
