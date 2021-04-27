package com.java8.concept.model;

public class Employee {

	private String eName;
	private String eLstname;
	private Double salary;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteLstname() {
		return eLstname;
	}

	public void seteLstname(String eLstname) {
		this.eLstname = eLstname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eLstname=" + eLstname + ", salary=" + salary + "]";
	}

	public Employee(String eName, String eLstname, Double salary) {
		super();
		this.eName = eName;
		this.eLstname = eLstname;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

}
