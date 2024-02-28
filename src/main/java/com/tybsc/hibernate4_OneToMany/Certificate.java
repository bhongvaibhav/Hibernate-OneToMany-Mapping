package com.tybsc.hibernate4_OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Certificate 
{
	@Id @GeneratedValue
	private int id;
	
	private String name;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + "]";
	}
	
	

}
