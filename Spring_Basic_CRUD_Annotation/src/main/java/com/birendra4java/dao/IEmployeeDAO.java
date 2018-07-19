package com.birendra4java.dao;

import java.util.List;

import com.birendra4java.entity.Employee;

public interface IEmployeeDAO {
	public void saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getOneEmployee(int empId);

	public void deleteEmployee(int empId);
	
	public void updateEmployee(Employee employee);
}
