package com.training.profile;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();

		((AnnotationConfigApplicationContext) context).getEnvironment().setActiveProfiles("Development","Production");

		// scans the mentioned packages[s] and register all the componenets available in
		// the spring

		((AnnotationConfigApplicationContext) context).scan("com.training.profile");
		((AnnotationConfigApplicationContext) context).refresh();
		
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
