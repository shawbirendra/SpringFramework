package com.birendra4java.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.birendra4java.beans.Employee;
import com.birendra4java.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
	}
}
