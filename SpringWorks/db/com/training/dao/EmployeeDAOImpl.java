package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDAO;
import com.trainning.mappers.EmployeeMapper;

public class EmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate template;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(dataSource);

	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select empid,empname,empsal from employee where empid=?";
		// return template.queryForObject(sql, new Object[] { empId }, new
		// BeanPropertyRowMapper<>(Employee.class));
		return template.queryForObject(sql, new Object[] { empId }, new EmployeeMapper());
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql = "select empid,empname,empsal from employee=";
		List<Employee> employees = new ArrayList<>();
		List<Map<String, Object>> rows=template.queryForList(sql);
		for(Map row:rows) {
			Employee  employee=new Employee();
			employee.setEmpId(Integer.parseInt(row.get("empid").toString()));
			employee.setEmpName(row.get("empname").toString());
			employee.setEmpSal(Double.parseDouble(row.get("empsal").toString()));
		}
		
		return null;
	}

	@Override
	public void insertEmployee(Employee employee) {
		String sql = "insert into employee(empid,empname,empsal)values(?,?,?)";
		template.update(sql, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal());
		System.out.println("Record Created : " + employee);
		return;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub

	}

}
