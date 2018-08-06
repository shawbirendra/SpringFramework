package com.training.employee;

public class Employee {
	private int empID;
	private String empName;
	private double empSal;

	public Employee() {
		System.out.println("Employee.Employee() default constructor invoked..");
	}

	public Employee(int empID, String empName, double empSal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public void init() {
		System.out.println("Employee.init()");
	}

	public void destroy() {
		System.out.println("Employee.destroy()");
	}
	public void ginit() {
		System.out.println("Employee.ginit()");
	}
	public void gdestroy() {
		System.out.println("Employee.gdestroy()");
	}
}
