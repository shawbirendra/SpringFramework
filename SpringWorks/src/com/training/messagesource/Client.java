package com.training.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("message_resource-context.xml");
		String engGoodMorning=context.getMessage("goodmorning", new Object[] {},null);
		String frGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("FR"));
		String grGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("GR"));
		String hiGoodMorning=context.getMessage("goodmorning", new Object[] {},new Locale("hi", "IN"));
		
		System.out.println(engGoodMorning);
		System.out.println(frGoodMorning);
		System.out.println(grGoodMorning);
		System.out.println(hiGoodMorning);
		System.out.println("----------------------------------");
		
		HelloWorld helloWorld=context.getBean(HelloWorld.class);
		helloWorld.sayHello();
		helloWorld.sayHello_fr();
		helloWorld.sayHello_gr();	}
	
	

}
