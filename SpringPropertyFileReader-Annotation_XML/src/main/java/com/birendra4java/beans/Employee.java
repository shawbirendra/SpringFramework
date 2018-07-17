package com.birendra4java.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${employee.id}")
	private int employeeId;
	@Value("${employee.name}")
	private String employeeName;
	@Value("${employee.addr}")
	private String employeeAddress;
	@Value("${employee.sal}")
	private double salary;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", salary=" + salary + "]";
	}

}
