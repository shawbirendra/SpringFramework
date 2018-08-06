package com.training.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	public static void main(String[] args) {
		// XmlBeanFactory factory = null;
		// factory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-context.xml");

		HelloService helloService = factory.getBean("defaultHello", DefaultHello.class);
		System.out.println(helloService.sayHello());
		((AbstractApplicationContext) factory).close();

	}
}
