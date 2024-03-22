package com.mar21.inheritance.models;
/*
 * @author Harshitha.D
 * Employee class having setters and getters
 */
public class Employee {
	private String name;
	protected float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return  salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float calculateBonus() {
		return 0;
	}
}