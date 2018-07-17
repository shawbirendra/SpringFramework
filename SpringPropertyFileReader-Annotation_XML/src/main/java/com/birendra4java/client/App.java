package com.birendra4java.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.birendra4java.beans.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:/com/birendra4java/resources/applicationContext.xml");
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
	}
}
