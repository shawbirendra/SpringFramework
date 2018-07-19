package com.birendra4java.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.birendra4java.config.AppConfig;
import com.birendra4java.dao.EmployeeDAOImpl;
import com.birendra4java.dao.IEmployeeDAO;
import com.birendra4java.entity.Employee;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployeeDAO dao = applicationContext.getBean("dao", EmployeeDAOImpl.class);
		// create employee object to persist in db
		Employee employee1 = new Employee(101, "Birendra", 10000, "Software");
		Employee employee2 = new Employee(102, "Rahul", 20000, "Manager");
		Employee employee3 = new Employee(103, "Rakesh", 5000, "IT Desk");
		Employee employee4 = new Employee(104, "Shyam", 15000, "Sr Software");
		
		//call saveEmployee(-) to save emp details
		/*dao.saveEmployee(employee1);
		dao.saveEmployee(employee2);
		dao.saveEmployee(employee3);
		dao.saveEmployee(employee4);*/
		
		//loading saved details
		List<Employee> emps=dao.getAllEmployee();
		emps.forEach(System.out::print);
		
		// loading one employee details
		Employee e=dao.getOneEmployee(103);
		System.out.println(e);
		
		//updating one employee
		/*Employee updateEmp=new Employee(101, "Birendra", 25000, "Software");
		dao.updateEmployee(updateEmp);*/
		
		//deleting emp
		//dao.deleteEmployee(103);
	}
}
