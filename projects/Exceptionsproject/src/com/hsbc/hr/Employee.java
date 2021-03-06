package com.hsbc.hr;

import com.hsbc.hr.exceptions.SalaryException;

public class Employee {

	private int empId;
	private String name;
	private float salary;

	public Employee(int empId, String name, float salary) throws SalaryException {
		super();
		
		if(salary < 20000)
			throw new SalaryException("Employee object cannot be created with salary "+salary);
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) throws SalaryException {
		
		if(salary < 20000)
			throw new SalaryException("Salary cannot be changed to less tha minimum salary");
		this.salary = salary;
	}

	public void showDetails() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

}
