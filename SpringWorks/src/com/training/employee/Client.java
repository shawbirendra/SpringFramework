package com.training.employee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-context2.xml");
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml","spring-context.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.hashCode());
		System.out.println("Emp Id : " + employee.getEmpID());
		System.out.println("Emp Name : " + employee.getEmpName());
		System.out.println("Emp Sal : " + employee.getEmpSal());
		System.out.println("--------------------------------------------------");
//		employee = context.getBean("employee", Employee.class);
//		System.out.println(employee.hashCode());
//		System.out.println("Emp Id : " + employee.getEmpID());
//		System.out.println("Emp Name : " + employee.getEmpName());
//		System.out.println("Emp Sal : " + employee.getEmpSal());
		
		context.registerShutdownHook();
	}
}
