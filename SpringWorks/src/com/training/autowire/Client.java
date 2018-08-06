package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("camera-context.xml","spring-context3.xml","screen-context.xml","speaker-context.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context3.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);
		System.out.println("------Mobile Details------");
		System.out.println("Mobile Type : " + mobile.getCamera().getType());
		System.out
				.println("Speaker Details : " + mobile.getSpeaker().getType() + ", " + 
		                                        mobile.getSpeaker().getVolume());

		System.out.println("Screen Details : " + mobile.getScreen().getGlassType() + ", " + 
		                                         mobile.getScreen().getLen()	+ ", " + 
		                                         mobile.getScreen().getBre());
	}
}
