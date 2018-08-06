package com.training.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.EmployeeDAOImpl;
import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("db-context.xml");

		IEmployeeDAO employeeDAO = context.getBean(EmployeeDAOImpl.class);

		// insert employee
		Employee employee1 = new Employee(101, "Birendra", 100000);
		Employee employee2 = new Employee(102, "Rakesh", 15000);
		Employee employee3 = new Employee(103, "Shyam", 25000);
		Employee employee4 = new Employee(104, "Ramu-Kaka", 14000);
		Employee employee5 = new Employee(105, "God-Rakha", 5000);

		List<Employee> employees = employeeDAO.getAllEmps();
		for (Employee e : employees) {
			System.out.println(e);
		}

		// employeeDAO.insertEmployee(employee1);
		// employeeDAO.insertEmployee(employee2);
		// employeeDAO.insertEmployee(employee3);
		// employeeDAO.insertEmployee(employee4);
		// employeeDAO.insertEmployee(employee5);

		Employee e = employeeDAO.getEmployee(102);
		System.out.println(e);
	}
}
