package com.mar21.inheritance;
import com.mar21.inheritance.models.Employee;

/*
 * @author Harshitha.D
 * Manager class extends Employee class
 */
public class Manager extends Employee{
	//Manager constructor having name and salary parameters
	public Manager(String name, float salary) {
		setName(name);
		setSalary(salary);
	}
	//Override the calculateBonus() method
	@Override
	public float calculateBonus() {
		return (float) (getSalary()*0.10);
	}
	
}
