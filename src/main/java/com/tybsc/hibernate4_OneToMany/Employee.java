package com.tybsc.hibernate4_OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employee 
{
	@Id @GeneratedValue
	private int id;
	
	private String firstName;
	private String lastName;
	private int salary;
	
	@OneToMany
	@JoinColumn(name="employee_id")
	private List<Certificate>certificates;

	//private Object certificates;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int salary, ArrayList<Certificate> certificates)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	

}
