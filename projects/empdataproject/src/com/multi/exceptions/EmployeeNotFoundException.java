package com.multi.exceptions;

public class EmployeeNotFoundException extends Exception {

	int empId;

	public EmployeeNotFoundException(int empId) {
		super();
		this.empId = empId;
	}

	public void showMessage() {
		System.out.println("Employee with ID " + empId + " not found");
	}

}
