package com.birendra4java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.birendra4java.entity.Employee;

@Repository("dao")
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveEmployee(Employee employee) {
		String sql = "insert into employee(empid,empname,salary,dept)values(?,?,?,?)";
		int res = jdbcTemplate.update(sql, employee.getEmpId(), employee.getEmpName(), employee.getSalary(),
				employee.getDept());
		if (res == 1) {
			System.out.println("Employee Details Saved Successfully");
		} else {
			System.out.println("Failed to Insert Details");
		}
		return;
	}

	public List<Employee> getAllEmployee() {
		String sql = "select empid,empname,salary,dept from Employee";
		List<Employee> employees = new ArrayList<>();
		List<Map<String, Object>> rows=jdbcTemplate.queryForList(sql);
		
		for(Map row:rows) {
			Employee  employee=new Employee();
			employee.setEmpId(Integer.parseInt(row.get("empid").toString()));
			employee.setEmpName(row.get("empname").toString());
			employee.setSalary(Double.parseDouble(row.get("salary").toString()));
			employee.setDept(row.get("salary").toString());
			employees.add(employee);
		}
		
		return employees;
	}

	public Employee getOneEmployee(int empId) {
		String sql = "select empid,empname,salary,dept from Employee where empid=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { empId }, new BeanPropertyRowMapper<>(Employee.class));
	}

	public void deleteEmployee(int empId) {
		String sql = "delete employee where empid=?";
		int res = jdbcTemplate.update(sql, empId);
		if (res == 1) {
			System.out.println("Employee Details with id: "+empId+" deleted Successfully");
		} else {
			System.out.println("Failed to deleted Details with empid " + empId);
		}
		return;
	}

	public void updateEmployee(Employee employee) {
		String sql="update Employee set empid=?,empname=?,salary=?,dept=? where empid=?";
        int res=jdbcTemplate.update(sql,employee.getEmpId(),employee.getEmpName(),employee.getSalary(),employee.getDept(),employee.getEmpId());
        if (res == 1) {
			System.out.println("Employee "+employee.getEmpName()+" Details updated Successfully");
		} else {
			System.out.println("Failed to update Details with empid " + employee.getEmpId());
		}
		return;
	}

}